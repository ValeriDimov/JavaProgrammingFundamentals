package Exams.Final;

import java.util.Scanner;

public class T01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Generate")) {
            String[] commandsArray = commands.split(">>>");
            String command = commandsArray[0];

            switch (command) {
                case "Contains":
                    String substring = commandsArray[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String flipCommand = commandsArray[1];
                    int startIndex = Integer.parseInt(commandsArray[2]);
                    int endIndex = Integer.parseInt(commandsArray[3]);
                    if (flipCommand.equals("Upper")) {
                        String substringForUpper = activationKey.substring(startIndex, endIndex);
                        String substringToUpperCase = substringForUpper.toUpperCase();
                        activationKey = activationKey.replaceFirst(substringForUpper, substringToUpperCase);
                    } else {
                        String substringForLower = activationKey.substring(startIndex, endIndex);
                        String substringToLowerCase = substringForLower.toLowerCase();
                        activationKey = activationKey.replaceFirst(substringForLower, substringToLowerCase);
                    }
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    startIndex = Integer.parseInt(commandsArray[1]);
                    endIndex = Integer.parseInt(commandsArray[2]);
                    String substringToRemove = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replaceFirst(substringToRemove, "");
                    System.out.println(activationKey);
                    break;
            }

            commands = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
