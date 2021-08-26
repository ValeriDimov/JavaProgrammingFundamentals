package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n = 96 + n1;

        for (int i = 97; i <= n; i++) {
            for (int j = 97; j <= n; j++) {
                for (int k = 97; k <= n; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}

