package by.epam.array.parser;

import by.epam.array.exception.CustomArrayIsEmptyException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomArrayParser {
    public static int [] parseCustomArray(String customArray) {
        List<Integer> arrayListInteger = new ArrayList<>();
        int i = 0;
        int[] array;
        if(customArray.isEmpty()){
            throw new CustomArrayIsEmptyException("Array is empty");
        } else {
            String [] arrayString = customArray.split(" ");
            array = new int[arrayString.length];
            for(String item : arrayString) {
               array[i] = Integer.parseInt(item);
               i++;
            }
        }

        return array;
    }
}
