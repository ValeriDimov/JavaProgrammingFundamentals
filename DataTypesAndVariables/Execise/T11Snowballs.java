package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double snowballValueMax = Double.NEGATIVE_INFINITY;
        int snowballSnowMax = Integer.MIN_VALUE;
        int snowballTimeMax = Integer.MIN_VALUE;
        int snowballQualityMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = 0;
            snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);

            if (snowballValueMax < snowballValue){
                snowballValueMax = snowballValue;
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, snowballValueMax, snowballQualityMax);
    }
}
