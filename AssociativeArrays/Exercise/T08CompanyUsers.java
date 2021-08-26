package AssociativeArrays.Exercise;

import java.util.*;

public class T08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companyIdsMap = new TreeMap<>();

        while (!input.equals("End")) {
            String[] inputArray = input.split(" -> ");
            String company = inputArray[0];
            String id = inputArray[1];

            if (!companyIdsMap.containsKey(company)) {
                companyIdsMap.put(company, new ArrayList<>());
                companyIdsMap.get(company).add(id);
            } else {
                if (!companyIdsMap.get(company).contains(id)) {
                    companyIdsMap.get(company).add(id);
                }
            }
            input = scanner.nextLine();
        }
        companyIdsMap.entrySet().stream().forEach(stringListEntry -> {
            System.out.println(stringListEntry.getKey());
            stringListEntry.getValue().stream().forEach(element -> System.out.printf("-- %s%n", element));
        });
    }
}
