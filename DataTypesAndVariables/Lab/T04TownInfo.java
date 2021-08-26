package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        double squareKilometres = Double.parseDouble(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.", town, population, squareKilometres);
    }
}
