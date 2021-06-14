package by.epam.array.reader.impl;

import by.epam.array.exception.CustomArrayException;
import by.epam.array.reader.CustomArrayReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CustomArrayReaderImplTest {

    CustomArrayReader customArrayReader;

    @BeforeClass
    public void setUp() {
        customArrayReader = new CustomArrayReaderImpl();
    }

    @Test
    public void getStringFromFileTestTrue() throws CustomArrayException {
        String actual = customArrayReader.getStringFromFile("src//main//resources//file//array.txt");
        String expected = "55 1 2 5";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getStingFromFileAllStringsAreInvalidTest() throws CustomArrayException {
        String actual = customArrayReader.getStringFromFile("src//main//resources//file//array2.txt");
        Assert.assertNull(actual);
    }
}
