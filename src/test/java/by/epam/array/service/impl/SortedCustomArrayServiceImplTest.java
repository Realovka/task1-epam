package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.SortedCustomArrayService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SortedCustomArrayServiceImplTest {
    CustomArray customArray;
    SortedCustomArrayService sortedCustomArrayService;

    @BeforeClass
    public void setUp() {
        customArray = new CustomArray(5, 0, -77, -25);
        sortedCustomArrayService = new SortedCustomArrayServiceImpl();
    }

    @Test
    public void selectionSortTest() {
        int[] actual = sortedCustomArrayService.selectionSort(customArray);
        int[] expected = new int[] {-77, -25, 0, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void insertionSortTest() {
        int[] actual = sortedCustomArrayService.insertionSort(customArray);
        int[] expected = new int[] {-77, -25, 0, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void quickSortTest() {
        int[] actual = sortedCustomArrayService.quickSort(customArray);
        int[] expected = new int[] {-77, -25, 0, 5};
        Assert.assertEquals(actual, expected);
    }
}
