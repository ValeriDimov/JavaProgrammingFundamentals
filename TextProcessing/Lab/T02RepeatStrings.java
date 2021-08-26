package TextProcessing.Lab;

import java.util.Scanner;

public class T02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");

        for (String word : inputArray) {
            for (int i = 0; i < word.length(); i++) {
                System.out.print(word);
            }
        }
    }
}
