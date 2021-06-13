package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.OperationCustomArrayService;

import java.util.Arrays;

public class OperationCustomArrayStreamServiceImpl implements OperationCustomArrayService {

    @Override
    public int findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = Arrays.stream(array).max().getAsInt();
        return max;
    }

    @Override
    public int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = Arrays.stream(array).max().getAsInt();
        return min;
    }

    @Override
    public int findSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = Arrays.stream(array).sum();
        return sum;
    }

    @Override
    public double findAverageValue(CustomArray customArray) {
        int[] array = customArray.getArray();
        double averageValue = Arrays.stream(array).average().getAsDouble();
        return averageValue;
    }

    @Override
    public long getNumberPositiveElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        long numberPositive = Arrays.stream(array).filter(element -> element > 0).count();
        return numberPositive;
    }

    @Override
    public long getNumberNegativeElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        long numberNegative = Arrays.stream(array).filter(element -> element < 0).count();
        return numberNegative;
    }
}
