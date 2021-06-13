package by.epam.array.reader.impl;

import by.epam.array.reader.CustomArrayReader;
import by.epam.array.validator.CustomArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomArrayReaderImpl implements CustomArrayReader {
    private final String DELIMITER = " ";

    private static final Logger logger = LogManager.getLogger();

    public String getStringFromFile(String pathToFile) {
        StringBuffer stringBuffer = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            String lineFromFile = bufferedReader.readLine();
            while (lineFromFile!= null) {
                if (CustomArrayValidator.modelArrayIsValid(lineFromFile)) {
                     stringBuffer.append(lineFromFile).append(DELIMITER);
                     lineFromFile = bufferedReader.readLine();
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            logger.error("File can't be open");
        }
        logger.log(Level.INFO,"String from file: " + stringBuffer);
        return stringBuffer.toString();
    }
}
