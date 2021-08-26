package Exams.Mid;

import java.util.Scanner;

public class T01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalPriceBeforeTaxes = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double partsPrices = Double.parseDouble(input);
            if (partsPrices < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            totalPriceBeforeTaxes += partsPrices;

            input = scanner.nextLine();
        }

        if (totalPriceBeforeTaxes == 0) {
            System.out.println("Invalid order!");
            return;
        }
        double priceAfterTaxes = 0;
        if (input.equals("regular")) {
            priceAfterTaxes = totalPriceBeforeTaxes + (totalPriceBeforeTaxes * 0.2);
        } else {
            priceAfterTaxes = (totalPriceBeforeTaxes + (totalPriceBeforeTaxes * 0.2)) * 0.9;

        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalPriceBeforeTaxes);
        System.out.printf("Taxes: %.2f$%n", totalPriceBeforeTaxes * 0.2);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", priceAfterTaxes);

    }
}
