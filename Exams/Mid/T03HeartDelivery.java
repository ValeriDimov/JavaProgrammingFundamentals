package Exams.Mid;

import java.util.Arrays;
import java.util.Scanner;

public class T03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] housesArray = Arrays.stream(input.split("@")).mapToInt(Integer::parseInt).toArray();
        int jumpPosition = 0;
        String commands = scanner.nextLine();

        while (!commands.equals("Love!")) {
            String[] commandsArray = commands.split("\\s+");
            int jump = Integer.parseInt(commandsArray[1]);

            if (jumpPosition + jump < housesArray.length) {
                jumpPosition += jump;
                printOrSetHouseStatus(housesArray, jumpPosition);
            } else {
                jumpPosition = 0;
                printOrSetHouseStatus(housesArray, jumpPosition);
            }
            commands = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", jumpPosition);

        int placesFailed = housesArray.length;
        for (int temp : housesArray) {
            if (temp == 0) {
                placesFailed--;
            }
        }
        if (placesFailed == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", placesFailed);
        }
    }

    private static void printOrSetHouseStatus(int[] housesArray, int jumpPosition) {
        if (housesArray[jumpPosition] == 0) {
            System.out.printf("Place %d already had Valentine's day.%n", jumpPosition);
        } else if (housesArray[jumpPosition] == 2) {
            System.out.printf("Place %d has Valentine's day.%n", jumpPosition);
            housesArray[jumpPosition] = 0;
        } else {
            housesArray[jumpPosition] -= 2;
        }
    }
}
