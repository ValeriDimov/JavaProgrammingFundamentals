package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> listInput = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        int lengthListTarget = listInput.size() - 2;
        for (int i = lengthListTarget; i >= 0; i--) {
            listInput.add(listInput.get(i));
            listInput.remove(listInput.get(i));
        }
        String output = "";
        for (String temp : listInput) {
            output += temp + " ";
        }
        String newOutput = output.trim().replaceAll("\\s+", " ");
        System.out.println(newOutput);
    }
}
