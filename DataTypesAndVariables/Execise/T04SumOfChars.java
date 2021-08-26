package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= lines; i++) {
            String letter = scanner.nextLine();
            int result = letter.charAt(0);
            sum += result;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
