package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        int[] numberArray1 = Arrays.stream(array1).mapToInt(value -> Integer.parseInt(value)).toArray();
        int[] numberArray2 = Arrays.stream(array2).mapToInt(value -> Integer.parseInt(value)).toArray();
        boolean flag = false;
        int sum = 0;

        for (int i = 0; i < numberArray1.length; i++) {
            if (numberArray1[i] != numberArray2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                flag = true;
                break;
            } else {
                sum += numberArray1[i];
            }
        }
        if (!flag) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
