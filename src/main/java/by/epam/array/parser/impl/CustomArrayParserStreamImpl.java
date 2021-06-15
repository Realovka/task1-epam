package by.epam.array.parser.impl;

import by.epam.array.exception.CustomArrayException;
import by.epam.array.parser.CustomArrayParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArrayParserStreamImpl implements CustomArrayParser {

    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER = "\\s";

    @Override
    public int[] parseCustomArray(String customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "String from file is empty");
            throw new CustomArrayException();
        }
        String[] arrayString = customArray.split(DELIMITER);
        int[] array = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
        logger.log(Level.INFO, "String from file parsed to array");
        return array;
    }
}
