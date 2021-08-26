package Exams.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> itemsList = Arrays.stream(input.split(",\\s+")).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("Craft!")) {
            String[] commandsArray = commands.split(" - ");
            String command = commandsArray[0];
            String item = commandsArray[1];

            switch (command) {
                case "Collect":
                    if (!itemsList.contains(item)) {
                        itemsList.add(item);
                    }
                    break;
                case "Drop":
                    itemsList.remove(item);
                    break;
                case "Combine Items":
                    String[] oldAndNewItems = item.split(":");
                    String oldItem = oldAndNewItems[0];
                    String newItem = oldAndNewItems[1];

                    if (itemsList.contains(oldItem)) {
                        itemsList.add(itemsList.indexOf(oldItem) + 1, newItem);
                    }

                    break;
                case "Renew":
                    if (itemsList.contains(item)) {
                        itemsList.remove(item);
                        itemsList.add(item);
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
        System.out.println(String.join(", ", itemsList));
    }
}

