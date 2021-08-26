package TextProcessing.Lab;

import java.util.Scanner;

public class T01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder updatedCommand = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                char currentSymbol = input.charAt(i);
                updatedCommand.append(currentSymbol);
            }

            System.out.printf("%s = %s%n", input, updatedCommand);
            input = scanner.nextLine();
        }


    }
}
