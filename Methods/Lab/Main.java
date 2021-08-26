package Methods.Lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(findOddDigits(n));
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

