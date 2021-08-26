package Arrays.Exercise;

import java.util.Scanner;

public class T04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] newArray = new String[array.length];

        if (array.length > n) {
            for (int i = 0; i < array.length - n; i++) {
                for (int j = 0; j < n; j++) {
                    newArray[array.length - n + j] = array[j];
                }
            }
            for (int i = 0; i < array.length - n; i++) {
                newArray[i] = array[i + n];
            }

        } else {
            for (int i = n; i >= array.length; i -= array.length) {
                n -= array.length;
            }
            for (int i = 0; i < array.length - n; i++) {
                for (int j = 0; j < n; j++) {
                    newArray[array.length - n + j] = array[j];
                }
            }
            for (int i = 0; i < array.length - n; i++) {
                newArray[i] = array[i + n];
            }
        }
        for (String temp : newArray) {
            System.out.print(temp + " ");
        }
    }
}
