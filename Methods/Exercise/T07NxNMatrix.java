package Methods.Exercise;

import java.util.Scanner;

public class T07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printMatrixRows(number);
    }

    private static void printMatrixRows(int number) {
        for (int row = 1; row <= number; row++) {
            for (int columns = 1; columns <= number; columns++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
