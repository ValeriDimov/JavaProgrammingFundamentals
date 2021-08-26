package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        List<Integer> firstCards = Arrays.stream(input1.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondCards = Arrays.stream(input2.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int listsLength = 0;

        while (firstCards.size() - 1 >= 0 && secondCards.size() - 1 >= 0) {
            if (firstCards.get(0) > secondCards.get(0)) {
                firstCards.add(firstCards.get(0));
                firstCards.add(secondCards.get(0));
                firstCards.remove(firstCards.get(0));
                secondCards.remove(secondCards.get(0));
            } else if (firstCards.get(0).equals(secondCards.get(0))) {
                firstCards.remove(firstCards.get(0));
                secondCards.remove(secondCards.get(0));
            } else {
                secondCards.add(secondCards.get(0));
                secondCards.add(firstCards.get(0));
                firstCards.remove(firstCards.get(0));
                secondCards.remove(secondCards.get(0));

            }
        }


        int sum = 0;
        if (firstCards.size() == 0 && secondCards.size() == 0) {
        } else if (firstCards.size() == 0) {
            for (int temp1 : secondCards) {
                sum += temp1;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else if (secondCards.size() == 0) {
            for (int temp1 : firstCards) {
                sum += temp1;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
