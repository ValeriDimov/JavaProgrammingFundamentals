package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbersList = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();
        while (!commands.equals("end")) {
            String[] commandsArray = commands.split(" ");
            int lengthList = numbersList.size();
            switch (commandsArray[0]) {
                case "Delete":
                    for (int i = 0; i < lengthList; i++) {
                        numbersList.remove(Integer.valueOf(Integer.parseInt(commandsArray[1])));
//                        lengthList -= 1;
                    }
                    break;
                case "Insert":
                    numbersList.add(Integer.parseInt(commandsArray[2]), Integer.parseInt(commandsArray[1]));
                    break;
            }

            commands = scanner.nextLine();
        }
        for (int tempNum : numbersList) {
            System.out.print(tempNum + " ");
        }
    }
}
