package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words =input.split("\\s+");
        Map<String, Integer> evenWords = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.length() % 2 == 0) {
                System.out.println(currentWord);
            }
        }
    }
}
