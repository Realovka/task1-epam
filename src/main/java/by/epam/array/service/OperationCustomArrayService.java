package by.epam.array.service;

import by.epam.array.entity.CustomArray;

public interface OperationCustomArrayService {
    int findMax(CustomArray customArray);
    int findMin(CustomArray customArray);
    int findSum(CustomArray customArray);
    double findAverageValue(CustomArray customArray);
    long getNumberPositiveElements(CustomArray customArray);
    long getNumberNegativeElements(CustomArray customArray);
}
