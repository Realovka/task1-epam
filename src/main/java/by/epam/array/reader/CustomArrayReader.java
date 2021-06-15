package by.epam.array.reader;

import by.epam.array.exception.CustomArrayException;

public interface CustomArrayReader {
    String readStringFromFile(String pathToFile) throws CustomArrayException;
}
