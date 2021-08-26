package Exams.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<separator>[=]|[\\\\/])(?<trip>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int travelPoints = 0;
        List<String> towns = new ArrayList<>();

        while (matcher.find()) {
           String town = matcher.group("trip");
           travelPoints += town.length();
           towns.add(town);
        }
        System.out.println("Destinations: " + String.join(", ", towns));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
