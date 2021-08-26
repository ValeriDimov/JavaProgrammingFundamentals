package RealExamFundamentals;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodFor30DaysInKilo = Double.parseDouble(scanner.nextLine());
        double hayFor30DaysInKilo = Double.parseDouble(scanner.nextLine());
        double coverFor30DaysInKilo = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        double foodInGrams = foodFor30DaysInKilo * 1000;
        double hayInGrams = hayFor30DaysInKilo * 1000;
        double coverInGrams = coverFor30DaysInKilo * 1000;
        double weightInGrams = weight * 1000;

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;
            if (i % 2 == 0) {
                hayInGrams -= foodInGrams * 0.05;
            }
            if (i % 3 == 0) {
                coverInGrams -= (weightInGrams / 3);
            }
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);
    }
}
