package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class T02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> names = Arrays.stream(input.split(", ")).collect(Collectors.toList());
        Map<String, Integer> raceMap = new LinkedHashMap<>();
        names.stream().forEach(element -> raceMap.put(element, 0));

        String input2 = scanner.nextLine();
        String regexNames = "[A-Za-z]+";
        String regexDistance = "[0-9]";

        while (!input2.equals("end of race")) {
            Pattern patternNames = Pattern.compile(regexNames);
            Pattern patternDistance = Pattern.compile(regexDistance);
            Matcher matcherNames = patternNames.matcher(input2);
            Matcher matcherDistance = patternDistance.matcher(input2);

            StringBuilder currentName = new StringBuilder();
            while (matcherNames.find()) {
                currentName.append(matcherNames.group());
            }

            int temporaryDistance = 0;
            while (matcherDistance.find()) {
                temporaryDistance += Integer.parseInt(matcherDistance.group());
            }

            int distanceUpdate = 0;
            if (raceMap.containsKey(currentName.toString())) {
                distanceUpdate = raceMap.get(currentName.toString());
            }

            if (raceMap.containsKey(currentName.toString())) {
                raceMap.put(currentName.toString(), distanceUpdate + temporaryDistance);
            }

            input2 = scanner.nextLine();
        }
        String[] firstPlace = {"1st place: ", "2nd place: ", "3rd place: "};

        List<String> sorted = raceMap
                .entrySet()
                .stream().sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .collect(Collectors.toList())
                .stream().limit(3)
                .map(el -> el.getKey())
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", sorted.get(0));
        System.out.printf("2nd place: %s%n", sorted.get(1));
        System.out.printf("3rd place: %s%n", sorted.get(2));


    }
}
