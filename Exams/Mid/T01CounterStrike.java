package Exams.Mid;

import java.util.Scanner;

public class T01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int winsCount = 0;
        String input = scanner.nextLine();
        boolean isOutOfEnergy = false;

        while (!input.equals("End of battle")) {
            int enemyDistance = Integer.parseInt(input);

            if (energy >= enemyDistance) {
                winsCount++;
                energy -= enemyDistance;
            } else {
                isOutOfEnergy = true;
                break;
            }
            if (winsCount % 3 == 0) {
                energy += winsCount;
            }
            input = scanner.nextLine();
        }
        if (isOutOfEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", winsCount, energy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", winsCount, energy);
        }
    }
}
