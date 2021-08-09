package by.epam.luki;

import by.epam.lukyanau.CustomStringUtils;

import java.util.Arrays;

public class CustomUtils {
    private CustomUtils() {

    }

    public static boolean isAllPositiveNumbers(String... numbers) {
        return Arrays.stream(numbers).allMatch(CustomStringUtils::isPositiveNumber);
    }
}
