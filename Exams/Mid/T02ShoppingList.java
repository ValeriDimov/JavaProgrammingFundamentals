package Exams.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> shoppingList = Arrays.stream(input.split("!")).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("Go Shopping!")) {
            String[] commandsArray = commands.split("\\s+");
            String command = commandsArray[0];
            String item = commandsArray[1];

            switch (command) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    shoppingList.remove(item);
                    break;
                case "Correct":
                    String newItem = commandsArray[2];
                    if (shoppingList.contains(item)) {
                        shoppingList.set(shoppingList.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
