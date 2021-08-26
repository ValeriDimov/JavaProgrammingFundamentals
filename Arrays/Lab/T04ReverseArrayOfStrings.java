package Arrays.Lab;

import java.util.Scanner;

public class T04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        String[] tempArray = inputArray;
        String[] outputArray = new String[tempArray.length];
        int counter = 0;

        for (int i = 0; i < tempArray.length / 2; i++) {
            outputArray[i] = tempArray[tempArray.length - i - 1];
        }
        for (int i = (tempArray.length) - 1; i >= tempArray.length / 2; i--) {
            //counter = (tempArray.length) / 2;
            outputArray[i] = tempArray[counter];
            counter++;
        }
        for (String output : outputArray) {
            System.out.print(output + " ");
        }
    }
}
