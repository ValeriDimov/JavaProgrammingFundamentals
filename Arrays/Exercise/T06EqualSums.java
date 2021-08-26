package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(value -> Integer.parseInt(value)).toArray();
        int sumLeft = 0;
        int sumRight = 0;
        int countElements = 0;
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < i; j++) {
                sumLeft += array[j];
                countElements = j + 1;
            }
            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                flag = true;
                break;
            }
            sumLeft = 0;
            sumRight = 0;
        }
         if (!flag){
            System.out.println("no");
        }
    }
}
