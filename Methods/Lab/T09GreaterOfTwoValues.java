package Methods.Lab;

import java.util.Scanner;

public class T09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();
        switch (valueType) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getMaxValue(firstNumber, secondNumber));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMaxValue(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMaxValue(firstString, secondString));
                break;
        }
    }

    private static int getMaxValue(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    private static char getMaxValue(char firstChar, char secondChar) {
        int char1 = firstChar;
        int char2 = secondChar;
        if (char1 > char2) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    private static String getMaxValue(String firstString, String secondString) {

        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        } else {
            return secondString;
        }
    }
}
