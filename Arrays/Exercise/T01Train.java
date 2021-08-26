package Arrays.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        String[] peopleArray = new String[wagons];
        for (int i = 0; i < wagons; i++) {
            peopleArray[i] = scanner.nextLine();
        }
        for (String temp : peopleArray) {
            System.out.print(temp + " ");
        }
        int[] sumArray = Arrays.stream(peopleArray).mapToInt(value -> Integer.parseInt(value)).toArray();
        for (int temp : sumArray) {
            sum += temp;
        }
        System.out.println();
        System.out.println(sum);
    }
}
