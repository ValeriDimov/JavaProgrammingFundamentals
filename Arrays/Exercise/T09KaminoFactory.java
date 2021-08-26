package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] numArray = new int[n];
        int[] numArrayBestSample = numArray;
        int countSamples = 0;
        int countBestSample = 0;
        int sum = 0;

        while (!input.equals("Clone them!")) {
            int length = 1;
            int tempSum = 0;

            numArray = Arrays.stream(input.split("!")).mapToInt(value -> Integer.parseInt(value)).toArray();

            for (int j = 1; j < numArray.length; j++) {
                if (numArray[j] == (numArray[j - 1]) && numArray[j] == 1) {
                    tempSum += numArray[j] + 1;
                    length++;
                }
            }
            if (length > 1) {
                countSamples++;
            }
            if (length > 1 && numArray[numArray.length - 2] == 0 && numArray[numArray.length - 1] == 1) {
                tempSum += 1;
            }
            if (sum <= tempSum) {
                sum = tempSum;
                countBestSample = countSamples;
                numArrayBestSample = numArray;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", countBestSample, sum);
        for (int temp : numArrayBestSample) {
            System.out.print(temp + " ");
        }
    }
}
