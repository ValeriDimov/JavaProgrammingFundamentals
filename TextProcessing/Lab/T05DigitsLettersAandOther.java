package TextProcessing.Lab;

import java.util.Scanner;

public class T05DigitsLettersAandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                digits.append(input.charAt(i));
            } else if (Character.isLetter(symbol)) {
                letters.append(input.charAt(i));
            } else {
                others.append(input.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
