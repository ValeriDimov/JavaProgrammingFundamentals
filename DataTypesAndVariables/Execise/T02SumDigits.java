package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number != 0) {
            int singleNum = number % 10;
            sum += singleNum;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
