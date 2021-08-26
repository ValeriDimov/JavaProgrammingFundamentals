package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(numbers.get(i));
                i = -1;
            }
        }
        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }
}

