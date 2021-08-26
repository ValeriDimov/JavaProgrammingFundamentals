package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int[] numbersArray = Arrays.stream(inputArray).mapToInt(value -> Integer.parseInt(value)).toArray();
        int sumEvens = 0;
        int sumOdds = 0;
        int calculation = 0;

        for (int number : numbersArray) {
            if (number % 2 == 0) {
                sumEvens += number;
            }else {
                sumOdds += number;
            }
        }
        calculation = sumEvens - sumOdds;
        System.out.println(calculation);
    }
}
