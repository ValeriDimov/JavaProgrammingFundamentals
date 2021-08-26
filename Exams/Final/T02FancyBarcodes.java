package Exams.Final;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String currentBarcode = matcher.group("barcode");
                String codeNumber = "";
                for (int j = 0; j < currentBarcode.length(); j++) {
                    if (Character.isDigit(currentBarcode.charAt(j))) {
                        codeNumber += currentBarcode.charAt(j);
                    }
                }
                if (codeNumber.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", codeNumber);
                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
