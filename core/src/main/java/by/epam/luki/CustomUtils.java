package by.epam.luki;

import by.epam.lukyanau.CustomStringUtils;

public class CustomUtils {
    public static boolean isAllPositiveNumbers(String... numbers) {
        for (String number : numbers) {
            if(!CustomStringUtils.isPositiveNumber(number)){
                return false;
            }
        }
        return true;
    }
}
