package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] commandsArray = commands.split(" ");
            switch (commandsArray[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(commandsArray[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(Integer.parseInt(commandsArray[1])));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(commandsArray[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(commandsArray[2]), Integer.parseInt(commandsArray[1]));
                    break;
            }
            commands = scanner.nextLine();
        }
        for (int temp : numbers) {
            System.out.print(temp + " ");
        }
    }
}
