package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] commandsArray = commands.split(" ");

            switch (commandsArray[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commandsArray[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandsArray[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (commandsArray[1].equals("<")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < Integer.parseInt(commandsArray[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray[1].equals("<=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= Integer.parseInt(commandsArray[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray[1].equals(">")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > Integer.parseInt(commandsArray[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray[1].equals(">=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= Integer.parseInt(commandsArray[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
    }
}
