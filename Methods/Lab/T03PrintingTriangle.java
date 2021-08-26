package Methods.Lab;

import java.util.Scanner;

public class T03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        printTriangle(input);
    }

    private static void printTriangle(int input) {
        printTopOfTriangle(input);
        printBottomOfTriangle(input);

    }

    private static void printTopOfTriangle(int input) {
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printBottomOfTriangle(int input) {
        for (int i = input; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
