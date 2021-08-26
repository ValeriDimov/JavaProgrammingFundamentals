package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(",\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        Article article = new Article(inputArray[0], inputArray[1], inputArray[2]);

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String[] commandArray = command.split(": ");

            switch (commandArray[0]) {
                case "Edit":
                    article.setContent(commandArray[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commandArray[1]);
                    break;
                case "Rename":
                    article.setTitle(commandArray[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
