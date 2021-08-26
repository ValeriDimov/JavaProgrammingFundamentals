package Exams.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<separator>[@|#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int wordPairsCounter = 0;
        List<String> validPairsList = new ArrayList<>();

        while (matcher.find()) {
            String firstWord = matcher.group("word1");
            String secondWord = matcher.group("word2");
            wordPairsCounter++;
            String wordsConcat = "";

            StringBuilder stringBuilder = new StringBuilder(secondWord);
            stringBuilder.reverse();
            if (firstWord.equals(stringBuilder.toString())) {
                wordsConcat = String.format("%s <=> %s",firstWord, secondWord);
                validPairsList.add(wordsConcat);
            }
        }
        if (wordPairsCounter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", wordPairsCounter);
        }
        if (validPairsList.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", validPairsList));
        }
    }
}
