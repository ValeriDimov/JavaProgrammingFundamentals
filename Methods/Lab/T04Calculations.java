package Methods.Lab;

import java.util.Scanner;

public class T04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        getCalculationOfTwoNumbers(calculation, firstNumber, secondNumber);
    }

    private static void getCalculationOfTwoNumbers(String calculation, int firstNumber, int secondNumber) {
        getCalculationAdd(calculation, firstNumber, secondNumber);
        getCalculationMultiply(calculation, firstNumber, secondNumber);
        getCalculationSubtract(calculation, firstNumber, secondNumber);
        getCalculationDivide(calculation, firstNumber, secondNumber);
    }

    private static void getCalculationDivide(String calculation, int firstNumber, int secondNumber) {
        double result = 0.0;
        if (calculation.equals("divide")) {
            result = 1.0 * firstNumber / secondNumber;
            System.out.printf("%.0f", result);
        }
    }

    private static void getCalculationSubtract(String calculation, int firstNumber, int secondNumber) {
        int result = 0;
        if (calculation.equals("subtract")) {
            result = firstNumber - secondNumber;
            System.out.println(result);
        }
    }

    private static void getCalculationMultiply(String calculation, int firstNumber, int secondNumber) {
        int result = 0;
        if (calculation.equals("multiply")) {
            result = firstNumber * secondNumber;
            System.out.println(result);
        }

    }

    private static void getCalculationAdd(String calculation, int firstNumber, int secondNumber) {
        int result = 0;
        if (calculation.equals("add")) {
            result = firstNumber + secondNumber;
            System.out.println(result);
        }
    }
}
