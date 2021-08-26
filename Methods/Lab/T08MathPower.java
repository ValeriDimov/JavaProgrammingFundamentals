package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double mathPower = Integer.parseInt(scanner.nextLine());
        double result = getValueOfNumberPowered(number, mathPower);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double getValueOfNumberPowered(double number, double mathPower) {
        double result = Math.pow(number, mathPower);
        return result;
    }
}
