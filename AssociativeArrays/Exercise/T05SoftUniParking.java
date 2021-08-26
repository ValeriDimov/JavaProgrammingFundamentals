package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingUsers = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split("\\s+");

            switch (inputArray[0]) {
                case "register":
                    if (!parkingUsers.containsKey(inputArray[1])) {
                        parkingUsers.put(inputArray[1], inputArray[2]);
                        System.out.printf("%s registered %s successfully%n", inputArray[1], inputArray[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", inputArray[2]);
                    }
                    break;
                case "unregister":
                    if (!parkingUsers.containsKey(inputArray[1])) {
                        System.out.printf("ERROR: user %s not found%n", inputArray[1]);
                    } else {
                        parkingUsers.remove(inputArray[1]);
                        System.out.printf("%s unregistered successfully%n", inputArray[1]);
                    }
                    break;
            }
        }
        parkingUsers.entrySet()
                .stream()
                .forEach(stringStringEntry -> System.out.printf("%s => %s%n"
                        , stringStringEntry.getKey(), stringStringEntry.getValue()));
    }
}
