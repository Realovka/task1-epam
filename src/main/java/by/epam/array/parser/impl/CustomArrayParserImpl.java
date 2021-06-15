package by.epam.array.parser.impl;

import by.epam.array.exception.CustomArrayException;
import by.epam.array.parser.CustomArrayParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParserImpl implements CustomArrayParser {

    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER = "\\s";

    public int[] parseCustomArray(String customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "String from file is empty");
            throw new CustomArrayException();
        }
        String[] arrayString = customArray.split(DELIMITER);
        int[] array = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }
        logger.log(Level.INFO, "String from file parsed to array");
        return array;
    }
}