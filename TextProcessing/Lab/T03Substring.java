package TextProcessing.Lab;

import java.util.Scanner;

public class T03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder updatedString = new StringBuilder(input);

        while (updatedString.toString().contains(wordToRemove)) {
            int startPosition = updatedString.indexOf(wordToRemove);
            int endPosition = startPosition + wordToRemove.length();
            updatedString.delete(startPosition, endPosition);

        }
        System.out.println(updatedString);
    }
}
