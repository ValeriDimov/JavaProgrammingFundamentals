package Exams.Mid;

import java.util.Arrays;
import java.util.Scanner;

public class T02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] enemiesArray = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input2 = scanner.nextLine();

        while (!input2.equals("End")) {
            int enemiesIndex = Integer.parseInt(input2);

            if (enemiesIndex < 0 || enemiesIndex >= enemiesArray.length) {
                input2 = scanner.nextLine();
                continue;
            }
            if (enemiesArray[enemiesIndex] == -1) {
                input2 = scanner.nextLine();
                continue;
            }
            int currentPower = enemiesArray[enemiesIndex];
            enemiesArray[enemiesIndex] = -1;
            for (int i = 0; i < enemiesArray.length; i++) {
                if (enemiesArray[i] != -1) {
                    if (currentPower >= enemiesArray[i]) {
                        enemiesArray[i] += currentPower;
                    } else {
                        enemiesArray[i] -= currentPower;
                    }
                }
            }
            input2 = scanner.nextLine();
        }
        int countShots = 0;
        for (int temp : enemiesArray) {
            if (temp == -1) {
                countShots++;
            }
        }
        System.out.printf("Shot targets: %d -> ", countShots);

        for (int temp : enemiesArray) {
            System.out.print(temp + " ");
        }
    }
}

