package Methods.Lab;

import java.util.Scanner;

public class T06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        double area = calculateRectangleArea(width, length);
        System.out.printf("%.0f", area);

    }

    private static double calculateRectangleArea(int width, int length) {
        return width * length;
    }
}
