package by.epam.array.validator;

public class CustomArrayValidator {
    private static final String SAMPLE = "^-?(\\d)+((\\s)+-?(\\d)+)*$";

    public static boolean modelArrayIsValid(String line) {
        return line.matches(SAMPLE);
    }
}
