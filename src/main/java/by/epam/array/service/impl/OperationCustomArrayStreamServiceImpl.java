package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.OperationCustomArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class OperationCustomArrayStreamServiceImpl implements OperationCustomArrayService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = Arrays.stream(array).max().getAsInt();
        logger.log(Level.INFO,"Max of array is "+ max);
        return max;
    }

    @Override
    public int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = Arrays.stream(array).max().getAsInt();
        logger.log(Level.INFO,"Min of array is " + min);
        return min;
    }

    @Override
    public int findSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = Arrays.stream(array).sum();
        logger.log(Level.INFO,"Sum of array is " + sum);
        return sum;
    }

    @Override
    public double findAverageValue(CustomArray customArray) {
        int[] array = customArray.getArray();
        double averageValue = Arrays.stream(array).average().getAsDouble();
        logger.log(Level.INFO,"Average of array is " + averageValue);
        return averageValue;
    }

    @Override
    public long getNumberPositiveElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        long numberPositive = Arrays.stream(array).filter(element -> element > 0).count();
        logger.log(Level.INFO,"Number of positive elements is " + numberPositive);
        return numberPositive;
    }

    @Override
    public long getNumberNegativeElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        long numberNegative = Arrays.stream(array).filter(element -> element < 0).count();
        logger.log(Level.INFO,"Number of negative elements is " + numberNegative);
        return numberNegative;
    }
}
