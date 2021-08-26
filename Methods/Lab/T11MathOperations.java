package Methods.Lab;

import java.io.BufferedReader;
import java.util.Scanner;

public class T11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculateTwoNumbers(firstNumber,operator, secondNumber));

    }

    private static double calculateTwoNumbers(int firstNumber, char operator, int secondNumber) {
        double result = 0;
        switch (operator) {
            case '/':
                result = 1.0 * firstNumber / secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
        }
        return result;
    }
}
