package by.epam.array.service;

import by.epam.array.entity.CustomArray;

public interface SortedCustomArrayService {
    int[] selectionSort(CustomArray customArray);
    int[] quickSort(CustomArray customArray);
    int[] insertSort(CustomArray customArray);
}
