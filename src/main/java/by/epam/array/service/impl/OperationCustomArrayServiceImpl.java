package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.OperationCustomArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OperationCustomArrayServiceImpl implements OperationCustomArrayService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >  max) {
               max = array[i];
            }
        }
        logger.log(Level.INFO,"Max of array is " + max);
        return max;
    }

    @Override
    public int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <  min) {
                min = array[i];
            }
        }
        logger.log(Level.INFO,"Min of array is " + min);
        return min;
    }

    @Override
    public int findSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for(int item : array) {
            sum += item;
        }
        logger.log(Level.INFO,"Sum of array is " + sum);
        return sum;
    }

    @Override
    public double findAverageValue(CustomArray customArray) {
        double averageValue = (double) findSum(customArray) / customArray.getArray().length;
        logger.log(Level.INFO,"Average of array is " + averageValue);
        return averageValue;
    }

    @Override
    public long getNumberPositiveElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int numberPositive = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
              numberPositive++;
            }
        }
        logger.log(Level.INFO,"Number of positive elements is " + numberPositive);
        return numberPositive;
    }

    @Override
    public long getNumberNegativeElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int numberNegative = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                numberNegative++;
            }
        }
        logger.log(Level.INFO,"Number of negative elements is " + numberNegative);
        return numberNegative;
    }
}
