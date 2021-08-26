package Methods.Lab;

import java.util.Scanner;

public class T10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.abs(getMultipleOfEvensAndOdds(number)));

    }

    private static int getMultipleOfEvensAndOdds(int number) {
        getSumOfEvens(number);
        getSumOfOdds(number);

        return getSumOfEvens(number) * getSumOfOdds(number);
    }

    private static int getSumOfEvens(int number) {
        int sumOfEvens = 0;
        int tempNum = 0;
        while (number != 0) {
            tempNum = number % 10;
            if (tempNum % 2 == 0) {
                sumOfEvens += tempNum;
            }
            number = number / 10;
        }
        return sumOfEvens;
    }

    private static int getSumOfOdds(int number) {
        int sumOfOdds = 0;
        int tempNum = 0;
        while (number != 0) {
            tempNum = number % 10;
            if (tempNum % 2 != 0) {
                sumOfOdds += tempNum;
            }
            number = number / 10;
        }
        return sumOfOdds;
    }

}
