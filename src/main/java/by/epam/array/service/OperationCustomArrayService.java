package by.epam.array.service;

import by.epam.array.entity.CustomArray;

public interface OperationCustomArrayService {
    int findMax(CustomArray customArray);
    int findMin(CustomArray customArray);
    int findSum(CustomArray customArray);
    double findAverageValue(CustomArray customArray);
    int getNumberPositiveElements(CustomArray customArray);
    int getNumberNegativeElements(CustomArray customArray);
}
