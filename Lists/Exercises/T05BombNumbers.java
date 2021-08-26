package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersInput = scanner.nextLine();
        String specialNumbers = scanner.nextLine();
        List<Integer> numbersList = Arrays.stream(numbersInput.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] arraySpecialNumbers = specialNumbers.split("\\s+");
        int bombNumber = Integer.parseInt(arraySpecialNumbers[0]);
        int powerNumber = Integer.parseInt(arraySpecialNumbers[1]);

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == bombNumber) {
                int startIndex = 0;
                if ((i - powerNumber) >= 0) {
                    startIndex = i - powerNumber;
                }
                int endIndex = 0;
                if ((i + powerNumber) <= numbersList.size() - 1) {
                    endIndex = i + powerNumber;
                } else {
                    endIndex = numbersList.size() - 1;
                }
                for (int j = endIndex; j >= startIndex; j--) {
                    numbersList.remove(j);
                    i = -1;

                }
            }
        }

        int sum = 0;
        for (int temp : numbersList) {
            sum += temp;
//            System.out.print(temp + " ");
        }
//        System.out.println();
        System.out.println(sum);
    }
}
