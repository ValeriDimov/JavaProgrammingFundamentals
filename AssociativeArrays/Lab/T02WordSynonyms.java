package AssociativeArrays.Lab;

import java.util.*;

public class T02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> dictionary = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!dictionary.containsKey(word)) {
                dictionary.put(word, new ArrayList<>());
                dictionary.get(word).add(synonym);
            } else {
                dictionary.get(word).add(synonym);
            }

        }
        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
//        dictionary.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " - " + String.join(", ", e.getValue())));
    }
}
