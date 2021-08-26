package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T02MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resources = scanner.nextLine();
        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!resources.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourcesMap.containsKey(resources)) {
                resourcesMap.put(resources, quantity);
            } else {
                int currentQuantity = resourcesMap.get(resources);
                resourcesMap.put(resources, currentQuantity + quantity);
            }

            resources = scanner.nextLine();
        }
//        resourcesMap.entrySet().stream()
//                .forEach(stringStringEntry -> System.out.printf("%s -> %d%n", stringStringEntry.getKey(), stringStringEntry.getValue()));

        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
