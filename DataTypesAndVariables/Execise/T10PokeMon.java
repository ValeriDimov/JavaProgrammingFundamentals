package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        double originalPower = 1.0 * power;
        int newPower = power;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokedCount = 0;

        for (int i = power; i >= distance; i -= distance) {
            newPower -= distance;
            pokedCount++;
            if (originalPower / 2 == 1.0 * newPower) {
                newPower /= exhaustionFactor;
                i = newPower;
            }
        }
        System.out.printf("%d%n%d", newPower, pokedCount);
    }
}