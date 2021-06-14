package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.OperationCustomArrayService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OperationCustomArrayServiceImplTest {

    CustomArray customArray;
    CustomArray customArrayForAverageValue;
    OperationCustomArrayService operationCustomArrayService;

    @BeforeClass
    public void setUp() {
        customArray = new CustomArray(4, -5, 18, 20, 0);
        customArrayForAverageValue = new CustomArray(5, 5, 5);
        operationCustomArrayService = new OperationCustomArrayServiceImpl();
    }

    @Test
    public void findMaxNotEqualsTest() {
        int actual = operationCustomArrayService.findMax(customArray);
        Assert.assertNotEquals(actual, -11);
    }

    @Test
    public void findMaxTest() {
        int actual = operationCustomArrayService.findMax(customArray);
        Assert.assertEquals(actual, 20);
    }

    @Test
    public void findMinNotEqualsTest() {
        int actual = operationCustomArrayService.findMin(customArray);
        Assert.assertNotEquals(actual, -11);
    }

    @Test
    public void findMinTest() {
        int actual = operationCustomArrayService.findMin(customArray);
        Assert.assertEquals(actual, -5);
    }

    @Test
    public void findSumTest() {
        int actual = operationCustomArrayService.findSum(customArray);
        Assert.assertEquals(actual, 37);
    }

    @Test
    public void findSumNotEqualsTest() {
        int actual = operationCustomArrayService.findSum(customArray);
        Assert.assertNotEquals(actual, 38);
    }

    @Test
    public void findAverageValueTest() {
        double actual = operationCustomArrayService.findAverageValue(customArrayForAverageValue);
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void findAverageValueNotEqualsTest() {
        double actual = operationCustomArrayService.findAverageValue(customArrayForAverageValue);
        Assert.assertNotEquals(actual, 6.3);
    }

    @Test
    public void getNumberPositiveElementsTest() {
        long actual = operationCustomArrayService.getNumberPositiveElements(customArray);
        Assert.assertEquals(actual, 3);
    }

    @Test
    public void getNumberPositiveElementsNotEqualsTest() {
        long actual = operationCustomArrayService.getNumberPositiveElements(customArray);
        Assert.assertNotEquals(actual, 1);
    }

    @Test
    public void getNumberNegativeElementsTest() {
        long actual = operationCustomArrayService.getNumberNegativeElements(customArray);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void getNumberNegativeElementsNotEqualsTest() {
        long actual = operationCustomArrayService.getNumberNegativeElements(customArray);
        Assert.assertNotEquals(actual, 4);
    }
}
