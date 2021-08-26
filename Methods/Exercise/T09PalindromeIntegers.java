package Methods.Exercise;

import java.util.Scanner;

public class T09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (input.equals(getNumberPalindromeOrNot(input))) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

    private static String getNumberPalindromeOrNot(String text) {
        String oppositeOfText = "";
        for (int i = (text.length() - 1); i >= 0; i--) {
            oppositeOfText += text.charAt(i);
        }
        return oppositeOfText;
    }

}
