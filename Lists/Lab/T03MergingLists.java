package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        List<Integer> firstNumberList = Arrays.stream(firstInput.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumberList = Arrays.stream(secondInput.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        if (firstNumberList.size() > secondNumberList.size()) {
            for (int i = 0; i < secondNumberList.size(); i++) {
                result.add(firstNumberList.get(i));
                result.add(secondNumberList.get(i));
            }
        } else {
            for (int i = 0; i < firstNumberList.size(); i++) {
                result.add(firstNumberList.get(i));
                result.add(secondNumberList.get(i));
            }
        }
        if (firstNumberList.size() > secondNumberList.size()) {
            int index = secondNumberList.size();
            for (int i = index; i < firstNumberList.size() ; i++) {
                result.add(firstNumberList.get(i));
            }
        } else if (secondNumberList.size() > firstNumberList.size()){
            int index = firstNumberList.size();
            for (int i = index; i < secondNumberList.size() ; i++) {
                result.add(secondNumberList.get(i));
            }
        }

        for (int temp : result) {
            System.out.print(temp + " ");
        }
    }
}
