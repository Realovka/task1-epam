package by.epam.array;

import by.epam.array.entity.CustomArray;
import by.epam.array.parser.CustomArrayParser;
import by.epam.array.reader.CustomArrayReader;
import by.epam.array.reader.impl.CustomArrayReaderImpl;
import by.epam.array.service.ChangeCustomArrayElementService;
import by.epam.array.service.OperationCustomArrayService;
import by.epam.array.service.SortedCustomArrayService;
import by.epam.array.service.impl.ChangeCustomArrayElementsImpl;
import by.epam.array.service.impl.OperationCustomArrayServiceImpl;
import by.epam.array.service.impl.SortedCustomArrayServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomArrayReader customArrayReader = new CustomArrayReaderImpl();
        String result = customArrayReader.getStringFromFile("src//main//resources//file//array.txt");
        int[] array = CustomArrayParser.parseCustomArray(result);
        CustomArray customArray = new CustomArray();
        customArray.setArray(array);

        SortedCustomArrayService sortedCustomArrayService = new SortedCustomArrayServiceImpl();
        int[] arrayResult = sortedCustomArrayService.selectionSort(customArray);
        for (int value : arrayResult) {
            System.out.print(value + " ");
        }

        System.out.println();

        OperationCustomArrayService operationCustomArrayService = new OperationCustomArrayServiceImpl();

        System.out.println(operationCustomArrayService.findMin(customArray));
        System.out.println(operationCustomArrayService.findMax(customArray));

        System.out.println(operationCustomArrayService.findSum(customArray));
        System.out.println(operationCustomArrayService.findAverageValue(customArray));

        System.out.println(operationCustomArrayService.getNumberNegativeElements(customArray));
        System.out.println(operationCustomArrayService.getNumberPositiveElements(customArray));

        ChangeCustomArrayElementService changeCustomArrayElementService = new ChangeCustomArrayElementsImpl();
        System.out.println(Arrays.toString(changeCustomArrayElementService.replaceCustomArrayElements(customArray)));
    }
}
