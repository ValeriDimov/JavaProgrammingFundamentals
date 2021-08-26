package RealFinalExamFundamentals;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialUsername = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Registration")) {
            String[] commandsArray = commands.split("\\s+");
            String currentCommand = commandsArray[0];

            switch (currentCommand) {
                case "Letters":
                    String subCommand = commandsArray[1];
                    if (subCommand.equals("Lower")) {
                        initialUsername = initialUsername.toLowerCase();
                        System.out.println(initialUsername);
                    }else {
                        initialUsername = initialUsername.toUpperCase();
                        System.out.println(initialUsername);
                    }
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(commandsArray[1]);
                    int endIndex = Integer.parseInt(commandsArray[2]) + 1;
                    if ((startIndex >= 0 && startIndex < initialUsername.length()) &&
                    endIndex > 0 && endIndex < initialUsername.length()) {
                        String tempSubstring = initialUsername.substring(startIndex, endIndex);
                        StringBuilder stringBuilder = new StringBuilder(tempSubstring);
                        stringBuilder.reverse();
                        System.out.println(stringBuilder);
                    }
                    break;
                case "Substring":
                    String substring = commandsArray[1];
                    if (initialUsername.contains(substring)) {
                        int beginIndex = initialUsername.indexOf(substring);
                        int finIndex = beginIndex + substring.length();
                        StringBuilder stringBuilder2 = new StringBuilder(initialUsername);
                        stringBuilder2.delete(beginIndex, finIndex);
                        initialUsername = stringBuilder2.toString();
                        System.out.println(initialUsername);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", initialUsername, substring);
                    }
                    break;
                case "Replace":
                    String tempChar1 = commandsArray[1];
                    initialUsername = initialUsername.replace(tempChar1, "" + '-');
                    System.out.println(initialUsername);
                    break;
                case "IsValid":
                    String tempChar2 = commandsArray[1];
                    if (initialUsername.contains(tempChar2)) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.", tempChar2);
                    }
                    break;
            }


            commands = scanner.nextLine();
        }
    }
}
