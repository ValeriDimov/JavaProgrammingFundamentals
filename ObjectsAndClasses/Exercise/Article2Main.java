package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Article2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article2> article2List = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(",\\s+");
            Article2 article2 = new Article2(inputArray[0], inputArray[1], inputArray[2]);
            article2List.add(article2);
        }
        String command = scanner.nextLine();
        List<Article2> sorted = new ArrayList<>();
        switch (command) {
            case "title":
                sorted = article2List.stream().sorted(Comparator.comparing(Article2::getTitle)).collect(Collectors.toList());
                break;
            case "content":
                sorted = article2List.stream().sorted(Comparator.comparing(Article2::getContent)).collect(Collectors.toList());
                break;
            case "author":
                sorted = article2List.stream().sorted(Comparator.comparing(Article2::getAuthor)).collect(Collectors.toList());
                break;
        }
        for (Article2 temp : sorted) {
            System.out.println(temp.toString());
        }
    }
}
