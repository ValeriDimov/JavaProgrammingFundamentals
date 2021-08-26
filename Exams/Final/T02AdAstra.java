package Exams.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<separator>[#|])(?<item>[A-Za-z ]+)\\1(?<date>[0-9]{2}/[0-9]{2}/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int totalCalories = 0;
        List<String> itemsList = new ArrayList<>();

        while (matcher.find()) {
            String item = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            String caloriesToText = matcher.group("calories");
            totalCalories += calories;
            itemsList.add(String.format("Item: %s, Best before: %s, Nutrition: %s", item, date, caloriesToText));
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
        itemsList.stream().forEach(e -> System.out.println(e));

    }
}
