package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(1.0 * peopleNumber / elevatorCapacity);
        System.out.printf("%.0f", courses);
    }
}
