package by.epam.array.parser.impl;

import by.epam.array.exception.CustomArrayException;
import by.epam.array.parser.CustomArrayParser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomArrayParserStreamImplTest {

    CustomArrayParser customArrayParser;
    String lineFromFile;
    String lineFromFileInvalid;

    @BeforeClass
    public void setUp() {
        customArrayParser = new CustomArrayParserStreamImpl();
        lineFromFile = "1 5 -44 9";
        lineFromFileInvalid = "";
    }

    @Test
    public void parseCustomArrayTest() throws CustomArrayException {
        int[] actual = customArrayParser.parseCustomArray(lineFromFile);
        int[] expected = new int[]{1, 5, -44, 9};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void parseCustomArrayTestFail() {
        Assert.expectThrows(CustomArrayException.class, () -> customArrayParser.parseCustomArray(lineFromFileInvalid));
    }
}
