package Exams.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<separator>[:][:]|[*][*])(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int coolThreshold = 1;
        List<String> emojisOverCoolList = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                int currentNum = Integer.parseInt( currentSymbol + "");
                coolThreshold *= currentNum;
            }
        }

        while (matcher.find()) {
            counter++;
            String currentEmoji = matcher.group("emoji");
            int emojiThreshold = 0;
            for (int i = 0; i < currentEmoji.length(); i++) {
                emojiThreshold += currentEmoji.charAt(i);
            }
            if (emojiThreshold >= coolThreshold) {
                emojisOverCoolList.add(matcher.group());
            }

        }
        System.out.printf("Cool threshold: %s%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counter);
        emojisOverCoolList.forEach(e -> System.out.println(e + " "));

    }
}
