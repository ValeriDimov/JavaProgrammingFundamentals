package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int tankLitres = 0;

        for (int i = 1; i <= n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());

            if (capacity >= litres) {
                tankLitres += litres;
                capacity -= litres;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(tankLitres);
    }
}
