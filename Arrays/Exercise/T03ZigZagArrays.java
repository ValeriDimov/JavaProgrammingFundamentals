package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                if (i % 2 == 0 && j == 0) {
                    array1[i] = input[0];
                    array2[i] = input[1];
                } else if (i % 2 != 0 && j == 0) {
                    array2[i] = input[0];
                    array1[i] = input[1];
                }
            }
        }
        for (String temp : array1) {
            System.out.print(temp + " ");
        }
        System.out.println();
        for (String temp : array2) {
            System.out.print(temp + " ");

        }
    }
}
