package Exams.Mid;

import java.util.Scanner;

public class T01NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeePeoplePerHour = Integer.parseInt(scanner.nextLine());
        int secondEmployeePeoplePerHour = Integer.parseInt(scanner.nextLine());
        int thirdEmployeePeoplePerHour = Integer.parseInt(scanner.nextLine());
        int totalPeopleCount = Integer.parseInt(scanner.nextLine());

        int totalPeoplePerHour = firstEmployeePeoplePerHour + secondEmployeePeoplePerHour + thirdEmployeePeoplePerHour;
        double timeNeeded = 1.0 * totalPeopleCount / totalPeoplePerHour;
        double timeForLoop = Math.ceil(timeNeeded);
        int additionalTime = (int) timeForLoop / 3;

        if (timeNeeded <= 3) {
            timeNeeded = Math.ceil(timeNeeded);
        } else {
            timeNeeded = Math.ceil(timeNeeded) + additionalTime;
        }
        System.out.printf("Time needed: %.0fh.", timeNeeded);
    }
}
