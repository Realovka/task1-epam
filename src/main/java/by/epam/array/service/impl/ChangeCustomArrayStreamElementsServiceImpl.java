package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.ChangeCustomArrayElementsService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ChangeCustomArrayStreamElementsServiceImpl implements ChangeCustomArrayElementsService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int[] replaceCustomArrayElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int[] sortArray = Arrays.stream(array).map(x -> -x).toArray();
        logger.log(Level.INFO,"Elements have been changed to opposite values");
        return sortArray;
    }
}
