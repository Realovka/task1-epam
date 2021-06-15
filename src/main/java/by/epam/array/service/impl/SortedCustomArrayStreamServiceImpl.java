package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.SortedCustomArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SortedCustomArrayStreamServiceImpl implements SortedCustomArrayService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int[] selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        return Arrays.stream(array).sorted().toArray();
    }

    @Override
    public int[] quickSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        return Arrays.stream(array).sorted().toArray();
    }

    @Override
    public int[] insertionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        return Arrays.stream(array).sorted().toArray();
    }
}
