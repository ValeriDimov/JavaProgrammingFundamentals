package ObjectsAndClasses.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> wordsList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        List<String> newWordsList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < wordsList.size(); i++) {
            int newPosition = rnd.nextInt(wordsList.size());
            newWordsList.add(wordsList.get(newPosition));
        }
        for (String temp : newWordsList) {
            System.out.println(temp);
        }
    }
}
