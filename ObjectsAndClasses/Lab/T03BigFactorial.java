package ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class T03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger bigInteger = new BigInteger(String.valueOf(number));
        for (int i = number - 1; i > 1; i--) {

            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(bigInteger);
    }
}
