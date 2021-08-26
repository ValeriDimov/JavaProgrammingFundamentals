package Methods.Lab;

import java.util.Scanner;

public class T07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatString = Integer.parseInt(scanner.nextLine());
        String repeatedString = getStringRepeated(input, repeatString);
        System.out.println(repeatedString);
    }

    private static String getStringRepeated(String input, int repeatString) {
        String newString = "";
        for (int i = 1; i <= repeatString; i++) {
            newString += input;
                    }
        return newString;
    }
}
