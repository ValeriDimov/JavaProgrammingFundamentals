package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T1CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == ' ') {
                continue;
            }
            if (!characterIntegerMap.containsKey(symbol)) {
                characterIntegerMap.put(symbol, 1);
            } else {
                int currentValue = characterIntegerMap.get(symbol);
                characterIntegerMap.put(symbol, currentValue + 1);
            }
        }
        characterIntegerMap.entrySet()
                .stream().forEach(characterIntegerEntry -> System.out.printf("%s -> %d%n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue()));
    }
}
