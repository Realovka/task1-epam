package by.epam.array.reader;

import by.epam.array.exception.CustomArrayIsInvalidException;
import by.epam.array.validator.CustomArrayValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomArrayReader {
    private static  final String DELIMITER = " ";

    public static String getStringFromFile(String pathToFile) {
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
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
