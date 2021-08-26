package BasicSintaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n * 2 - 1; i+= 2) {
            sum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: %d", sum);

    }
}
//Scanner sc = new Scanner(System.in);
//int n = Integer.parseInt(sc.nextLine());
//int sum = 1;
//for (int i = 0; i <= n; i++) {
//    System.out.print(2 * i + 1);
//    sum += 2 * i;
//}
//System.out.printf("Sum: %d%n", sum);