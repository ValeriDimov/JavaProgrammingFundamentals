package Arrays.Lab;

import java.util.Scanner;

public class T02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbersArray = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int numbers = Integer.parseInt(scanner.nextLine());
            numbersArray[i] = numbers;
        }
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
    }
}
