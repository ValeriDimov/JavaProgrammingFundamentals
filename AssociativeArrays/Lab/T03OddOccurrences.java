package AssociativeArrays.Lab;

import java.util.*;

public class T03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");
        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            String word = inputArray[i].toLowerCase();
            if (!occurrences.containsKey(word)) {
                occurrences.put(word, 1);
            } else {
                int wordCount = occurrences.get(word);
                occurrences.put(word, wordCount + 1);
            }
        }
        List<String> willPrint = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                willPrint.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", willPrint));
    }
}
