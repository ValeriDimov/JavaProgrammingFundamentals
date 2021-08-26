package Exams.Mid;

import java.util.*;
import java.util.stream.Collectors;

public class T02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> treasureList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        String commandsInput = scanner.nextLine();

        while (!commandsInput.equals("Yohoho!")) {
            String[] commandsArray = commandsInput.split("\\s+");
            String command = commandsArray[0];
            switch (command) {
                case "Loot":
                    List<String> lootsList = new ArrayList<>();
                    for (int i = 1; i < commandsArray.length; i++) {
                        lootsList.add(commandsArray[i]);
                    }
                    for (int i = 0; i < lootsList.size(); i++) {
                        if (!treasureList.contains(lootsList.get(i))) {
                            treasureList.add(0, lootsList.get(i));
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandsArray[1]);
                    if (index >= 0 && index < treasureList.size()) {
                        String lootGet = treasureList.get(index);
                        treasureList.add(lootGet);
                        treasureList.remove(index);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandsArray[1]);

                    if (count > treasureList.size()) {
                        count = treasureList.size();
                    }
                    List<String> stealList = new ArrayList<>();
                    int startIndex = treasureList.size() - count;

                    for (int i = startIndex; i < treasureList.size(); i++) {
                        stealList.add(treasureList.get(i));
                    }

                    for (int i = treasureList.size() - 1; i >= startIndex; i--) {
                        treasureList.remove(i);
                    }
                    System.out.println(String.join(", ", stealList));
                    break;
            }
            commandsInput = scanner.nextLine();
        }
        if (treasureList.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int sum = 0;
            for (int i = 0; i < treasureList.size(); i++) {
                String item = treasureList.get(i);
                for (int j = 0; j < item.length(); j++) {
                    sum++;
                }
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", 1.0 * sum / treasureList.size());
        }
    }
}
