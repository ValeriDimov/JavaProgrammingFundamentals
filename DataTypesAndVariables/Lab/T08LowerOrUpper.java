package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.nextLine();
        int convertToNumber = letter.charAt(0);

        if (convertToNumber >= 65 && convertToNumber <= 90) {
            System.out.println("upper-case");
        } else  if (convertToNumber >= 97 && convertToNumber <= 122) {
            System.out.println("lower-case");
        }
    }
}
