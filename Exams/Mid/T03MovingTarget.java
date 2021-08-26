package Exams.Mid;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> enemiesList = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] commandsArray = commands.split("\\s+");
            String command = commandsArray[0];
            int enemyIndex = Integer.parseInt(commandsArray[1]);
            int enemyValue = Integer.parseInt(commandsArray[2]);

            switch (command) {
                case "Shoot":
                    if (enemyIndex >= 0 && enemyIndex < enemiesList.size()) {
                        if (enemiesList.get(enemyIndex) > enemyValue) {
                            enemiesList.set(enemyIndex, enemiesList.get(enemyIndex) - enemyValue);
                        } else {
                            enemiesList.remove(enemyIndex);
                        }
                    }
                    break;
                case "Add":
                    if (enemyIndex >= 0 && enemyIndex < enemiesList.size()) {
                        enemiesList.add(enemyIndex, enemyValue);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (enemyIndex < 0 || enemyIndex >= enemiesList.size()) {
                        System.out.println("Strike missed!");
                    }
                    int startIndex = enemyIndex + enemyValue;
                    int endIndex = enemyIndex - enemyValue;
                    if (endIndex >= 0 && startIndex < enemiesList.size()) {
                        for (int i = startIndex; i >= endIndex; i--) {
                            enemiesList.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
        String[] newEnemiesArray = new String[enemiesList.size()];
        for (int i = 0; i < enemiesList.size(); i++) {
            newEnemiesArray[i] = "" + enemiesList.get(i);
        }

        System.out.println(String.join("|", newEnemiesArray));

    }
}
