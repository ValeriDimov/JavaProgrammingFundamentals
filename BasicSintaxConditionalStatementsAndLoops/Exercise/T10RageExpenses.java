package BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetTrashes = Math.floor(1.0 * gamesCount / 2) * headsetPrice;
        double mouseTrashes = Math.floor(1.0 * gamesCount / 3) * mousePrice;
        double keyboardTrashes = Math.floor(1.0 * gamesCount / 6) * keyboardPrice;
        double displayTrashes = Math.floor(1.0 * gamesCount / 12) * displayPrice;

        double totalExpense = headsetTrashes + mouseTrashes + keyboardTrashes + displayTrashes;

        System.out.printf("Rage expenses: %.2f lv.", totalExpense);


    }
}
