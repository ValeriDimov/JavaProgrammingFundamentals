package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int listSize = numbers.size();
        for (int i = 0; i < listSize / 2; i++) {
            int tempNumber = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.set(i, tempNumber);
            numbers.remove(numbers.size() - 1);
        }
        for (int temp : numbers) {
            System.out.print(temp + " ");
        }
    }
}
