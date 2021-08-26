package Methods.Exercise;

import java.util.Scanner;

public class T01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }

    private static int getSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int smallestNumber = 0;
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            smallestNumber = firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            smallestNumber = secondNumber;
        } else {
            smallestNumber = thirdNumber;
        }

        return smallestNumber;
    }

}
