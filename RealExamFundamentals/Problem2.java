package RealExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> particlesList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.equals("Done")) {
            String[] commandsArray = commands.split("\\s+");
            String command = commandsArray[0];

            switch (command) {
                case "Add":
                    String particle = commandsArray[1];
                    int indexAdd = Integer.parseInt(commandsArray[2]);
                    if (indexAdd >= 0 && indexAdd < particlesList.size()) {
                        particlesList.add(indexAdd, particle);
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(commandsArray[1]);
                    if (indexRemove >= 0 && indexRemove < particlesList.size()) {
                        particlesList.remove(indexRemove);
                    }
                    break;
                case "Check":
                    String check = "";
                    if (commandsArray[1].equals("Even")) {
                        for (int i = 0; i < particlesList.size(); i++) {
                            if (i % 2 == 0) {
                                check += particlesList.get(i) + " ";
                            }
                        }
                    } else {
                        for (int i = 0; i < particlesList.size(); i++) {
                            if (i % 2 != 0) {
                                check += particlesList.get(i) + " ";
                            }
                        }
                    }
                    System.out.println(check);
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.print("You crafted ");
        for (String temp : particlesList) {
            System.out.print(temp);
        }
        System.out.println("!");
    }
}
