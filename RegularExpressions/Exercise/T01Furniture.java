package RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-za-z]+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)\\b";
        double totalMoney = 0;
        List<String> furnitureList = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));;
                int quantity = Integer.parseInt(matcher.group("quantity"));;

                furnitureList.add(furniture);
                totalMoney += price * quantity;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.stream().forEach(element -> System.out.println(element));
        System.out.printf("Total money spend: %.2f", totalMoney);

    }
}
