package Exams.Mid;

import java.util.*;
import java.util.stream.Collectors;

public class T03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numberList = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sumNum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sumNum += numberList.get(i);
        }
        double averageNum = 1.0 * sumNum / numberList.size();
        for (int i = numberList.size() - 1; i >= 0; i--) {
            if (numberList.get(i) <= averageNum) {
                numberList.remove(i);
            }
        }
        if (numberList.isEmpty()) {
            System.out.println("No");
            return;
        }
        Collections.sort(numberList);
        Collections.reverse(numberList);

        if (numberList.size() <= 5) {
            for (int temp : numberList) {
                System.out.print(temp + " ");
            }
        } else {
            int[] fiveNumbersArray = new int[5];
            for (int i = 0; i < 5 ; i++) {
                fiveNumbersArray[i] = numberList.get(i);
            }
            for (int temp : fiveNumbersArray) {
                System.out.print(temp + " ");
            }
        }
    }
}
