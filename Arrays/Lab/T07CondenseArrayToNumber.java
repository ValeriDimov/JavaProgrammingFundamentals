package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
        boolean flag = false;
        while (arrayNumbers.length >= 2) {
            int[] condensedArray = new int[arrayNumbers.length - 1];
            for (int i = 0; i < condensedArray.length; i++) {
                condensedArray[i] = arrayNumbers[i] + arrayNumbers[i + 1];
            }
            String newCondensed = "";
            if (condensedArray.length >= 2) {
                newCondensed = "";
                for (int temp : condensedArray) {
                    newCondensed += String.format("%d ", temp);
                }
                arrayNumbers = Arrays.stream(newCondensed.split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
            }
            if (condensedArray.length == 1) {
                System.out.println(condensedArray[0]);
                break;
            }
            flag = true;
        }
        if (!flag) {
            System.out.println(arrayNumbers[0]);
        }
    }
}


