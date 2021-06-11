package by.epam.array;

import by.epam.array.entity.CustomArray;
import by.epam.array.parser.CustomArrayParser;
import by.epam.array.reader.CustomArrayReader;
import by.epam.array.service.OperationCustomArrayService;
import by.epam.array.service.SortedCustomArrayService;
import by.epam.array.service.impl.OperationCustomArrayServiceImpl;
import by.epam.array.service.impl.SortedCustomArrayServiceImpl;

public class Main {
    public static void main(String[] args) {
        String result = CustomArrayReader.getStringFromFile("src//main//resources//file//array.txt");
        int[] array = CustomArrayParser.parseCustomArray(result);
        CustomArray customArray = new CustomArray();
        customArray.setArray(array);

        SortedCustomArrayService sortedCustomArrayService = new SortedCustomArrayServiceImpl();
        int[] arrayResult = sortedCustomArrayService.selectionSort(customArray);
        for(int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i]+" ");
        }

        System.out.println();

        OperationCustomArrayService operationCustomArrayService = new OperationCustomArrayServiceImpl();

        System.out.println(operationCustomArrayService.findMin(customArray));
        System.out.println(operationCustomArrayService.findMax(customArray));

        System.out.println(operationCustomArrayService.findSum(customArray));
        System.out.println(operationCustomArrayService.findAverageValue(customArray));

        System.out.println(operationCustomArrayService.getNumberNegativeElements(customArray));
        System.out.println(operationCustomArrayService.getNumberPositiveElements(customArray));
    }
}
