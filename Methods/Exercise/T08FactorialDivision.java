package Methods.Exercise;

import java.util.Scanner;

public class T08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        double result = getFactorialNumber(firstNumber) / getFactorialNumber(secondNumber);

        System.out.printf("%.2f", result);
    }

    private static double getFactorialNumber(int number) {
        double factorialNumber = 1;

        for (int i = number; i >= 1; i--) {
            factorialNumber *= i;
        }

        return factorialNumber;
    }
}
