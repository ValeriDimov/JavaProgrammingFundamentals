package Exams.Final;

import java.util.Scanner;

public class T01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedCode = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Decode")) {
            String[] commandArray = commands.split("\\|");
            String currentCommand = commandArray[0];

            switch (currentCommand) {
                case "Move":
                    int numberLetters = Integer.parseInt(commandArray[1]);
                    String stringToMove = encryptedCode.substring(0, numberLetters);
                    StringBuilder stringBuilderTemp = new StringBuilder(encryptedCode);
                    stringBuilderTemp.delete(0, numberLetters);
                    stringBuilderTemp.append(stringToMove);
                    encryptedCode = stringBuilderTemp.toString();

                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArray[1]);
                    String value = commandArray[2];
                    StringBuilder stringBuilder = new StringBuilder(encryptedCode);
                    stringBuilder.insert(index, value);
                    encryptedCode = stringBuilder.toString();

                    break;
                case "ChangeAll":
                    String substring = commandArray[1];
                    String replacement = commandArray[2];
                    encryptedCode = encryptedCode.replace(substring, replacement);
                    break;
            }

            commands = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + encryptedCode);
    }
}
