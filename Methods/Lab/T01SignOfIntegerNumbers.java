package Methods.Lab;

import java.util.Scanner;

public class T01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        getSignOfInteger(n);

    }

    private static void getSignOfInteger(int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.%n", number);
        } else if (number == 0) {
            System.out.println("The number 0 is zero.");
        } else {
            System.out.printf("The number %d is positive.%n", number);
        }
    }
}
