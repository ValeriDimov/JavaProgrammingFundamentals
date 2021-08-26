package Exams.Mid;

import java.util.Arrays;
import java.util.Scanner;

public class T02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String input = scanner.nextLine();
        String[] roomsArray = (input.split("\\|"));

        for (int i = 0; i < roomsArray.length; i++) {
            String[] currentRoomArray = roomsArray[i].split("\\s+");
            String command = currentRoomArray[0];
            int points = Integer.parseInt(currentRoomArray[1]);

            switch (command) {
                case "potion":
                    if (health + points > 100) {
                        points = 100 - health;
                        health = 100;
                        System.out.printf("You healed for %d hp.%n", points);
                        System.out.printf("Current health: %d hp.%n", health);
                    } else {
                        health = health + points;
                        System.out.printf("You healed for %d hp.%n", points);
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    bitcoins += points;
                    System.out.printf("You found %d bitcoins.%n", points);
                    break;
                default:
                    health -= points;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        return;
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d%n", health);
    }
}
