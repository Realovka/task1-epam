package by.epam.array.reader.impl;

import by.epam.array.exception.CustomArrayException;
import by.epam.array.reader.CustomArrayReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class CustomArrayParserImplTest {

    CustomArrayReader customArrayReader;

    @BeforeClass
    public void setUp() {
        customArrayReader = new CustomArrayReaderImpl();
    }

    @Test
    public void readStringFromFileTestTrue() throws CustomArrayException {
        String actual = customArrayReader.readStringFromFile("src//main//resources//file//array.txt");
        String expected = "55 1 2 5";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void readStingFromFileAllStringsAreInvalidTest() throws CustomArrayException {
        String actual = customArrayReader.readStringFromFile("src//main//resources//file//array2.txt");
        Assert.assertNull(actual);
    }

    @Test(expectedExceptions = IOException.class)
    public void readStringFromFileExceptionTest() throws CustomArrayException {
        String actual = customArrayReader.readStringFromFile("src//main//resources//file//array3.txt");
    }
}
