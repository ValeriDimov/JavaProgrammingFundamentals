package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numArray = Arrays.stream(input).mapToInt(value -> Integer.parseInt(value)).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == n) {
                    System.out.printf("%d %d%n",numArray[i], numArray[j]);
                }
            }
        }        
    }
}
