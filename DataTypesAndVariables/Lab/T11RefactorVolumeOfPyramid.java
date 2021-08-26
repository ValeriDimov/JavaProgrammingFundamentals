package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //double dul, sh, V = 0;
        //System.out.print("Length: ");
        //dul = Double.parseDouble(scanner.nextLine());
        //System.out.print("Width: ");
        //sh = Double.parseDouble(scanner.nextLine());
        //System.out.print("Height: ");
        //V = Double.parseDouble(scanner.nextLine());
        //V = (dul + sh + V) / 3;
        //System.out.printf("Pyramid Volume: %.2f", V);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double pyramidVolume = (length * width / 3 * height);
        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", pyramidVolume);
    }
}
