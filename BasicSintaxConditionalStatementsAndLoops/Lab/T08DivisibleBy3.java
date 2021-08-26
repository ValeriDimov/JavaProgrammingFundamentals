package BasicSintaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T08DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
