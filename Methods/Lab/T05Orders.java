package Methods.Lab;

import java.util.Scanner;

public class T05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        getTotalPrice(product, quantity);
    }

    private static void getTotalPrice(String product, int quantity) {
        double totalPrice = 0.0;

        switch (product) {
            case "coffee":
                totalPrice = quantity * 1.5;
                break;
            case "water":
                totalPrice = quantity * 1.0;
                break;
            case "coke":
                totalPrice = quantity * 1.4;
                break;
            case "snacks":
                totalPrice = quantity * 2;
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
