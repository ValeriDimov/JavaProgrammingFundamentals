package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        String biggestKeg = "";

        for (int i = 1; i <= n; i++) {
            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double tempVolume = Math.PI * kegRadius * kegRadius * height;
            if (tempVolume > volume) {
                volume = tempVolume;
                biggestKeg = kegModel;
            }
        }
        System.out.println(biggestKeg);
    }
}
