package BasicSintaxConditionalStatementsAndLoops.MoreExercise;

import java.awt.image.AbstractMultiResolutionImage;
import java.util.Scanner;

public class T03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double initialBalance = currentBalance;
        double gamePrice = 0;

        String games = scanner.nextLine();
        boolean flag = false;
        while (!games.equals("Game Time")) {

            switch (games) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
            }
            if (currentBalance < gamePrice) {
                System.out.println("Too Expensive");
            } else {
                switch (games) {
                    case "OutFall 4":
                    case "RoverWatch Origins Edition":
                        gamePrice = 39.99;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", games);
                        break;
                    case "CS: OG":
                        gamePrice = 15.99;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", games);
                        break;
                    case "Zplinter Zell":
                        gamePrice = 19.99;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", games);
                        break;
                    case "Honored 2":
                        gamePrice = 59.99;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", games);
                        break;
                    case "RoverWatch":
                        gamePrice = 29.99;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", games);
                        break;
                    default:
                        System.out.println("Not Found");
                        break;
                }
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                flag = true;
                break;
            }
            games = scanner.nextLine();
        }
        if (flag) {
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", initialBalance - currentBalance, currentBalance);
        }
    }
}
