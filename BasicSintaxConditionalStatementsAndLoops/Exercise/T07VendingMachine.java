package BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins = scanner.nextLine();
        double totalMoney = 0.0;

        while (!coins.equals("Start")) {

            double moneyCoins = Double.parseDouble(coins);
            double realMoneyInserted = 0;
            switch (coins) {
                case "0.1":
                    realMoneyInserted = Double.parseDouble(coins);
                    break;
                case "0.2":
                    realMoneyInserted = Double.parseDouble(coins);
                    break;
                case "0.5":
                    realMoneyInserted = Double.parseDouble(coins);
                    break;
                case "1":
                    realMoneyInserted = Double.parseDouble(coins);
                    break;
                case "2":
                    realMoneyInserted = Double.parseDouble(coins);
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", moneyCoins);
                    break;
            }
            totalMoney += realMoneyInserted;
            coins = scanner.nextLine();
        }
        String products = scanner.nextLine();

        while (!products.equals("End")) {
            double price = 0;

            switch (products) {
                case "Nuts":
                    price  = 2.0;
                    if (totalMoney >= price) {
                        System.out.printf("Purchased %s%n", products);
                        totalMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price  = 0.7;
                    if (totalMoney >= price) {
                        System.out.printf("Purchased %s%n", products);
                        totalMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price  = 1.5;
                    if (totalMoney >= price) {
                        System.out.printf("Purchased %s%n", products);
                        totalMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price  = 0.8;
                    if (totalMoney >= price) {
                        System.out.printf("Purchased %s%n", products);
                        totalMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price  = 1.0;
                    if (totalMoney >= price) {
                        System.out.printf("Purchased %s%n", products);
                        totalMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            products = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}
