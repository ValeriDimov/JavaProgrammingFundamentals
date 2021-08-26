package RealExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> phonesList = Arrays.stream(input.split(",\\s+")).collect(Collectors.toList());

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] commandsArray = commands.split(" - ");
            String command = commandsArray[0];

            switch (command) {
                case "Add":
                    String phoneToAdd = commandsArray[1];
                    if (!phonesList.contains(phoneToAdd)) {
                        phonesList.add(phoneToAdd);
                    }
                    break;
                case "Remove":
                    String phoneToRemove = commandsArray[1];
                    phonesList.remove(phoneToRemove);
                    break;
                case "Bonus phone":
                    String[] bonusPhonesArray = commandsArray[1].split(":");
                    String oldPhone = bonusPhonesArray[0];
                    String newPhone = bonusPhonesArray[1];
                    if (phonesList.contains(oldPhone)) {
                       int indexOfOldPhone = phonesList.indexOf(oldPhone);
                       phonesList.add(indexOfOldPhone + 1, newPhone);
                    }

                    break;
                case "Last":
                    String phoneToChange = commandsArray[1];
                    if (phonesList.contains(phoneToChange)) {
                        phonesList.add(phoneToChange);
                        phonesList.remove(phoneToChange);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println(String.join(", ", phonesList));
    }
}
