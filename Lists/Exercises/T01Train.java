package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] commandsArray = commands.split(" ");
            if (commandsArray[0].equals("Add")) {
                numbers.add(Integer.parseInt(commandsArray[1]));
            } else {
                for (int i = 0; i < numbers.size(); i++) {
                    if ((Integer.parseInt(commandsArray[0]) + numbers.get(i)) <= maxCapacity) {
                        numbers.set(i, Integer.parseInt(commandsArray[0]) + numbers.get(i));
                        break;
                    }

                }

            }
            commands = scanner.nextLine();
        }
        for (int printNum: numbers) {
            System.out.print(printNum + " ");
        }

    }
}
