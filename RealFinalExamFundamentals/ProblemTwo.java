package RealFinalExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(?<separator>[\\w\\W]+)>(?<set1>[0-9]{3})[|](?<set2>[a-z]{3})[|](?<set3>[A-Z]{3})[|](?<set4>[^<>]{3})<\\1";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n; i++) {
            String passwords = scanner.nextLine();
            Matcher matcher = pattern.matcher(passwords);

            if (matcher.find()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(matcher.group("set1"));
                stringBuilder.append(matcher.group("set2"));
                stringBuilder.append(matcher.group("set3"));
                stringBuilder.append(matcher.group("set4"));

                System.out.printf("Password: %s%n", stringBuilder);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
