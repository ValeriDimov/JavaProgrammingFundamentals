package Methods.Exercise;

import java.util.Scanner;

public class T05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(getSubtractOfTwoNumbers(getSumOfTwoNumbers(firstNumber, secondNumber), thirdNumber));

    }

    private static int getSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int getSubtractOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
