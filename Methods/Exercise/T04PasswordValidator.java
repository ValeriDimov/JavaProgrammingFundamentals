package Methods.Exercise;

import java.util.Scanner;

public class T04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (checkPasswordLength(input) && checkLettersAndDigitsOnlyConsist(input) && haveAtLeastTwoDigits(input)) {
            System.out.println("Password is valid");
        }
        if (!checkPasswordLength(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkLettersAndDigitsOnlyConsist(input)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haveAtLeastTwoDigits(input)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean checkPasswordLength(String text) {
        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkLettersAndDigitsOnlyConsist(String text) {
        boolean isLetterOrDigit = true;

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetterOrDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean haveAtLeastTwoDigits(String text) {
        int countDigits = 0;
        //boolean isWithTwoDigits = true;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                countDigits++;
            }
        }
        if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
