package by.epam.array.creater;

import by.epam.array.entity.CustomArray;

public class CustomArrayCreator {
    public static CustomArray createCustomArray(int[] array) {
        return new CustomArray(array);
    }
}
