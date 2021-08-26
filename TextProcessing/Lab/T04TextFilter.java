package TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] forbiddenWords = scanner.nextLine().split(", ");
        List<String> charsToImplement = new ArrayList<>();
        String text = scanner.nextLine();

        for (String word : forbiddenWords) {
            StringBuilder tempWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                tempWord.append('*');
            }
            charsToImplement.add(tempWord.toString());
        }
        for (int i = 0; i < forbiddenWords.length; i++) {
            text = text.replace(forbiddenWords[i], charsToImplement.get(i));
        }
        System.out.println(text);
    }
}
