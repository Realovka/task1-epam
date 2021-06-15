package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.SortedCustomArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortedCustomArrayServiceImpl implements SortedCustomArrayService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int[] selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
        logger.log(Level.INFO,"Array was sorted using selection sort");
        return array;
    }

    @Override
    public int[] insertionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        logger.log(Level.INFO,"Array was sorted using insertion sort");
        return array;
    }

    @Override
    public int[] quickSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        quickSortArray(array, 0, array.length - 1);
        logger.log(Level.INFO,"Array was sorted using quick sort");
        return array;
    }

    private void quickSortArray(int[] arr, int from, int to) {
        if (from < to) {
            //находим индекс опорного элемента
            int divideIndex = partition(arr, from, to);

            quickSortArray(arr, from, divideIndex - 1);

            quickSortArray(arr, divideIndex, to);
        }
    }

    private int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {
            //двигаемся от начального элемента до стержня в посках элемента, который больше чем стержень
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            //двигаемся от последнего элемента до стержня в поисках элемента, который меньше чем стержень
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            //меняем эти элементы местами
            if (leftIndex <= rightIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
