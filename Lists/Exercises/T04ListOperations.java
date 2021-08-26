package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String commands = scanner.nextLine();
        int lengthList = numbers.size();

        while (!commands.equals("End")) {
            String[] currentCommand = commands.split("\\s+");
            switch (currentCommand[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(currentCommand[1]));
                    break;
                case "Insert":
                    if (isOutOfBound(Integer.parseInt(currentCommand[2]), numbers.size())) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(Integer.parseInt(currentCommand[2]), Integer.parseInt(currentCommand[1]));
                    }
                    break;
                case "Remove":
                    if (isOutOfBound(Integer.parseInt(currentCommand[1]), numbers.size())) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(Integer.parseInt(currentCommand[1]));
                    }
                    break;
                case "Shift":
                    if (currentCommand[1].equals("left")) {
                        for (int i = 1; i <= Integer.parseInt(currentCommand[2]); i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else {
                        for (int i = 1; i <= Integer.parseInt(currentCommand[2]); i++) {
                            numbers.add(0, (numbers.get(numbers.size() - 1)));
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
        for (int temp : numbers) {
            System.out.print(temp + " ");
        }
    }

    private static boolean isOutOfBound(int number, int size) {
        return (number < 0 || number >= size);
    }
}
