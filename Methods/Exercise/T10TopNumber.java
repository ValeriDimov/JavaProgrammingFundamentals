package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T10TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopNumbers(findTopNumbers(findOddDigits(n)));
    }

    private static void printTopNumbers(String topNumberResult) {
        int[] numbers = Arrays.stream(topNumberResult.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int topNumber : numbers) {
            System.out.println(topNumber);
        }
    }

    private static String findTopNumbers(String findOddDigitResult) {
        int[] numbers = Arrays.stream(findOddDigitResult.split(" ")).mapToInt(Integer::parseInt).toArray();
        String topNumberResult = "";
        for (int number : numbers) {
            int temp = number;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            if (sum % 8 == 0) {
                topNumberResult += number + " ";
            }
        }
        return topNumberResult;
    }

    private static String findOddDigits(int n) {
        String findOddDigitResult = "";

        for (int i = 1; i <= n; i++) {

            int temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                if (digit % 2 == 1) {
                    findOddDigitResult += i + " ";
                    break;
                } else {
                    temp /= 10;
                }
            }
        }
        return findOddDigitResult;
    }
}