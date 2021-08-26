package Exams.Mid;

import java.util.Arrays;
import java.util.Scanner;

public class T02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int sumPeopleInWagons = 0;


        for (int i = 0; i < wagons.length; i++) {
            int freeSpace = 4 - wagons[i];

            if (peopleNumber > 0) {
                if (peopleNumber > freeSpace) {
                    peopleNumber -= freeSpace;
                    wagons[i] = 4;
                } else {
                    wagons[i] += peopleNumber;
                    peopleNumber -= peopleNumber;
                }
            } else {
                break;
            }
            sumPeopleInWagons += wagons[i];

        }
        if (sumPeopleInWagons == wagons.length * 4 && peopleNumber == 0) {
            for (int temp : wagons) {
                System.out.print(temp + " ");
            }
            return;
        }

        if (sumPeopleInWagons < wagons.length * 4) {
            System.out.println("The lift has empty spots!");
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleNumber);
        }

        for (int temp : wagons) {
            System.out.print(temp + " ");
        }
    }
}
