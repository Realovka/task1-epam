package by.epam.array.reader.impl;

import by.epam.array.exception.CustomArrayException;
import by.epam.array.reader.CustomArrayReader;
import by.epam.array.validator.CustomArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomArrayReaderImpl implements CustomArrayReader {

    private static final Logger logger = LogManager.getLogger();

    public String readStringFromFile(String pathToFile) throws CustomArrayException {
        String lineFromFile;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            while ((lineFromFile = bufferedReader.readLine()) != null) {
                if (CustomArrayValidator.modelArrayIsValid(lineFromFile)) {
                    break;
                }
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File can't be open");
            throw new CustomArrayException();
        }
        logger.log(Level.INFO, "String from file: " + lineFromFile);
        return lineFromFile;
    }
}
