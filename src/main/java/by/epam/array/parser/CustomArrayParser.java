package by.epam.array.parser;

import by.epam.array.entity.CustomArray;
import by.epam.array.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParser {

    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER = " ";

    public static CustomArray parseCustomArray(String customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "String from file is empty");
            throw new CustomArrayException("String from file is empty");
        }
        int i = 0;
        String[] arrayString = customArray.split(DELIMITER);
        int[] array = new int[arrayString.length];
        for (String item : arrayString) {
            array[i] = Integer.parseInt(item);
            i++;
        }
        return new CustomArray(array);
    }
}