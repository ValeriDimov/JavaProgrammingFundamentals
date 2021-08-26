package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbersList = Arrays
                .stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).stream().limit(3)
                .forEach(integer -> System.out.print(integer + " "));

    }
}
