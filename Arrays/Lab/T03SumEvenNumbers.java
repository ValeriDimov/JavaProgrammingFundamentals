package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int[] numbersArray = Arrays.stream(array).mapToInt(value -> Integer.parseInt(value)).toArray();
        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                sum += numbersArray[i];
            }
        }
        System.out.println(sum);
    }
}
