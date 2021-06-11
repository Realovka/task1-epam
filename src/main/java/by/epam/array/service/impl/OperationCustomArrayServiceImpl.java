package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.OperationCustomArrayService;

public class OperationCustomArrayServiceImpl implements OperationCustomArrayService {

    @Override
    public int findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >  result) {
               result = array[i];
            }
        }
        return result;
    }

    @Override
    public int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <  result) {
                result = array[i];
            }
        }
        return result;
    }

    @Override
    public int findSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for(int item : array) {
            sum += item;
        }
        return sum;
    }

    @Override
    public double findAverageValue(CustomArray customArray) {
        return (double) findSum(customArray) / customArray.getArray().length;
    }

    @Override
    public int getNumberPositiveElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
              count++;
            }
        }
        return count;
    }

    @Override
    public int getNumberNegativeElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
