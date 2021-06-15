package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.ChangeCustomArrayElementsService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChangeCustomArrayElementsImplTest {

    CustomArray customArray;
    ChangeCustomArrayElementsService changeCustomArrayElementsService;

    @BeforeClass
    public void setUp() {
        customArray = new CustomArray(4, -5, 18, 20, 0);
        changeCustomArrayElementsService = new ChangeCustomArrayElementsServiceImpl();
    }

    @Test
    public void replaceCustomArrayElementsTest() {
        int[] expected = new int[]{-4, 5, -18, -20, 0};
        int[] actual = changeCustomArrayElementsService.replaceCustomArrayElements(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void replaceCustomArrayElementsNotEqualsTrue() {
        int[] expected = new int[]{4, 5, -18, -20, 0};
        int[] actual = changeCustomArrayElementsService.replaceCustomArrayElements(customArray);
        Assert.assertNotEquals(actual, expected);
    }
}
