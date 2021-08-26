package Exams.Final;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> composerMap = new TreeMap<>();
        Map<String, String> keyMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split("\\|");
            String piece = inputArray[0];
            String composer = inputArray[1];
            String key = inputArray[2];

            composerMap.put(piece, composer);
            keyMap.put(piece, key);
        }
        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            String[] commandsArray = commands.split("\\|");
            String currentCommand = commandsArray[0];
            String currentPiece = commandsArray[1];

            switch (currentCommand) {
                case "Add":
                    String currentComposer = commandsArray[2];
                    String currentKey = commandsArray[3];
                    if (composerMap.containsKey(currentPiece)) {
                        System.out.printf("%s is already in the collection!%n", currentPiece);
                    } else {
                        composerMap.put(currentPiece, currentComposer);
                        keyMap.put(currentPiece, currentKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentComposer, currentKey);
                    }
                    break;
                case "Remove":
                    if (!composerMap.containsKey(currentPiece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    } else {
                        composerMap.remove(currentPiece);
                        keyMap.remove(currentPiece);
                        System.out.printf("Successfully removed %s!%n", currentPiece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandsArray[2];
                    if (!composerMap.containsKey(currentPiece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    } else {
                        keyMap.put(currentPiece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", currentPiece, newKey);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        composerMap
                .entrySet()
                .stream()
                .forEach(piece -> {
                    String tempPiece = piece.getKey();
                    System.out.printf("%s -> Composer: %s, Key: %s%n", piece.getKey(), piece.getValue(), keyMap.get(tempPiece));
                });
    }
}
