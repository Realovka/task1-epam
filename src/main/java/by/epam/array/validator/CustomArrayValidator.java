package by.epam.array.validator;

public class CustomArrayValidator {
    private static final String EXPRESSION_FOR_VALIDATION = "^-?(\\d)+((\\s)+-?(\\d)+)*$";

    public static boolean modelArrayIsValid(String line) {
        return line.matches(EXPRESSION_FOR_VALIDATION);
    }
}
