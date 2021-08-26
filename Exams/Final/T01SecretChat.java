package Exams.Final;

import java.util.Scanner;

public class T01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String commands = scanner.nextLine();
        while (!commands.equals("Reveal")) {
            String[] commandsArray = commands.split(":\\|:");
            String currentCommand = commandsArray[0];

            switch (currentCommand) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandsArray[1]);
                    StringBuilder stringBuilder = new StringBuilder(message);
                    stringBuilder.insert(index, " ");
                    message = stringBuilder.toString();
                    System.out.println(message);

                    break;
                case "Reverse":
                    String substring = commandsArray[1];
                    if (!message.contains(substring)) {
                        System.out.println("error");
                    } else {
                        StringBuilder stringBuilderMessage = new StringBuilder(message);
                        int startIndex = stringBuilderMessage.indexOf(substring);
                        int endIndex = substring.length();
                        stringBuilderMessage.delete(startIndex, startIndex + endIndex);
                        //message = message.replaceFirst(substring, "");
                        StringBuilder stringBuilder1 = new StringBuilder(substring);
                        stringBuilder1.reverse();
                        stringBuilderMessage.append(stringBuilder1);
                        message = stringBuilderMessage.toString();
                        System.out.println(message);
                    }
                    break;
                case "ChangeAll":
                    String substring2 = commandsArray[1];
                    String replacement = commandsArray[2];
                    if (!message.contains(substring2)) {
                        System.out.println("error");
                    } else {
                        message = message.replace(substring2, replacement);
                        System.out.println(message);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
