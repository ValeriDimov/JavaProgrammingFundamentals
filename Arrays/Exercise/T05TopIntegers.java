package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (!(arr[i] > arr[j])) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}