package Exams.Final;

import java.util.Scanner;

public class T01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String commands = scanner.nextLine();
        StringBuilder oddsPassword = new StringBuilder();

        while (!commands.equals("Done")) {
            String[] commandArray = commands.split(" ");
            String command = commandArray[0];

            switch (command) {
                case "TakeOdd":
                    for (int i = 1; i < input.length(); i++) {
                        if (i % 2 == 1) {
                            oddsPassword.append(input.charAt(i));
                        }
                    }
                    input = oddsPassword.toString();
                    System.out.println(input);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandArray[1]);
                    int lengthCut = Integer.parseInt(commandArray[2]);
                    String substringToRemove = input.substring(index, index + lengthCut);
                    input = input.replaceFirst(substringToRemove, "");
                    System.out.println(input);
                    break;
                case "Substitute":
                    String substring = commandArray[1];
                    String substitute = commandArray[2];

                    if (input.contains(substring)) {
                        input = input.replaceAll(substring, substitute);
                        System.out.println(input);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;

            }
            commands = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", input);
    }
}
