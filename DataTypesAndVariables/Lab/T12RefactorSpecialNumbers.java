package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numbers; i++) {

            int currentNum = 0;
            int sumNum = 0;
            int number = i;

            while (number != 0) {
                currentNum = number % 10;
                sumNum += currentNum;
                number = number / 10;
            }
            if (sumNum / 5.0 == 1 || sumNum / 7.0 == 1 || sumNum / 11.0 == 1) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
