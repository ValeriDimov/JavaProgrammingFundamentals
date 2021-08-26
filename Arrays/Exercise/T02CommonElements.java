package Arrays.Exercise;

import java.util.Scanner;

public class T02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (int i = 0; i < array2.length; i++) {
            String element2 = array2[i];

            for (int j = 0; j < array1.length; j++) {
                String element1 = array1[j];
                if (element1.equals(element2)) {
                    System.out.print(element1 + " ");
                }
            }
        }
    }
}
