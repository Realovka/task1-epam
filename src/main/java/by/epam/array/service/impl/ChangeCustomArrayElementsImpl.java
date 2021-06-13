package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.ChangeCustomArrayElementService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeCustomArrayElementsImpl implements ChangeCustomArrayElementService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int[] replaceCustomArrayElements (CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i=0; i< array.length; i++) {
            array[i] = -array[i];
        }
        logger.log(Level.INFO,"Elements have been changed to opposite values");
        return array;
    }
}
