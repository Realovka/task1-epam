package by.epam.array.service.impl;

import by.epam.array.entity.CustomArray;
import by.epam.array.service.ChangeCustomArrayElementService;

public class ChangeCustomArrayElementsImpl implements ChangeCustomArrayElementService {

    @Override
    public int[] replaceCustomArrayElements (CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i=0; i< array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }
}
