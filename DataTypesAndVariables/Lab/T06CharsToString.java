package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();
        String lineThree = scanner.nextLine();

        String totalChars = String.format("%s%s%s", lineOne, lineTwo, lineThree);

        System.out.println(totalChars);
    }
}
