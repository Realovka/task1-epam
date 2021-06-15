package by.epam.array.parser;

import by.epam.array.exception.CustomArrayException;

public interface CustomArrayParser {
    int[] parseCustomArray(String customArray) throws CustomArrayException;
}
