package BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayType = scanner.nextLine();

        double singlePrice = 0;

        switch (groupType) {
            case "Students":
                if (dayType.equals("Friday")) {
                    singlePrice = 8.45;
                } else if (dayType.equals("Saturday")) {
                    singlePrice = 9.80;
                } else if (dayType.equals("Sunday")) {
                    singlePrice = 10.46;
                }
                break;
            case "Business":
                if (dayType.equals("Friday")) {
                    singlePrice = 10.90;
                } else if (dayType.equals("Saturday")) {
                    singlePrice = 15.60;
                } else if (dayType.equals("Sunday")) {
                    singlePrice = 16;
                }
                break;
            case "Regular":
                if (dayType.equals("Friday")) {
                    singlePrice = 15;
                } else if (dayType.equals("Saturday")) {
                    singlePrice = 20;
                } else if (dayType.equals("Sunday")) {
                    singlePrice = 22.50;
                }
                break;
        }
        double totalPrice = singlePrice * people;

        switch (groupType) {
            case "Students":
        if (people >= 30) {
            totalPrice -= (totalPrice * 0.15);
        }
                break;
            case "Business":
        if (people >= 100) {
            totalPrice -= (totalPrice / people * 10);
        }
                break;
            case "Regular":
        if (people >= 10 && people <= 20) {
            totalPrice -= (totalPrice * 0.05);
        }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
