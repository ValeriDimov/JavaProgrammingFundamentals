package AssociativeArrays.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        Map<String, Integer> itemsMap = new TreeMap<>();
        itemsMap.put("shards", 0);
        itemsMap.put("fragments", 0);
        itemsMap.put("motes", 0);
        boolean flag = false;

        while (itemsMap.get("shards") < 250 || itemsMap.get("fragments") < 250 || itemsMap.get("motes") < 250) {
            String[] inputArray = input.split("\\s+");
            int currentQuantity = 0;
            String currentItem = "";
            for (int i = 0; i < inputArray.length; i++) {
                if (i % 2 == 0) {
                    currentQuantity = Integer.parseInt(inputArray[i]);
                } else {
                    currentItem = inputArray[i];
                }
                if (i % 2 != 0) {
                    if (!itemsMap.containsKey(currentItem)) {
                        itemsMap.put(currentItem, currentQuantity);
                    } else {
                        int tempQuantity = itemsMap.get(currentItem);
                        itemsMap.put(currentItem, currentQuantity + tempQuantity);
                    }
                    if (itemsMap.get("shards") >= 250 || itemsMap.get("fragments") >= 250 || itemsMap.get("motes") >= 250) {
                       flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                break;
            }
            input = scanner.nextLine().toLowerCase();
        }
        if (itemsMap.get("shards") >= 250) {
            System.out.println("Shadowmourne obtained!");
            int tempQuantity = itemsMap.get("shards");
            itemsMap.put("shards", tempQuantity - 250);
        } else if (itemsMap.get("fragments") >= 250) {
            System.out.println("Valanyr obtained!");
            int tempQuantity = itemsMap.get("fragments");
            itemsMap.put("fragments", tempQuantity - 250);
        } else if (itemsMap.get("motes") >= 250){
            System.out.println("Dragonwrath obtained!");
            int tempQuantity = itemsMap.get("motes");
            itemsMap.put("motes", tempQuantity - 250);
        }
        Map<String, Integer> keyItems = new TreeMap<>();
        keyItems.put("shards", itemsMap.get("shards"));
        keyItems.put("fragments", itemsMap.get("fragments"));
        keyItems.put("motes", itemsMap.get("motes"));

        keyItems.entrySet()
                .stream().sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .collect(Collectors.toList())
                .forEach(stringIntegerEntry ->
                        System.out.printf("%s: %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));

        itemsMap.remove("fragments");
        itemsMap.remove("shards");
        itemsMap.remove("motes");

        itemsMap.entrySet().forEach(stringIntegerEntry ->
                System.out.printf("%s: %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));
    }
}
