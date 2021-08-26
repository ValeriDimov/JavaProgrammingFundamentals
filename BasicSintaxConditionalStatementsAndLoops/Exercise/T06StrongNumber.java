package BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int totalFactorialNumber = 0;
        int newN = Integer.parseInt(n);

        for (int i = 0; i < n.length(); i++) {
            int singleNumber = Integer.parseInt("" + n.charAt(i));
            int factorialNumber = 1;
            for (int j = singleNumber; j >= 1; j--) {
                factorialNumber *= j;
            }
            totalFactorialNumber += factorialNumber;
        }
        if (totalFactorialNumber == newN) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
