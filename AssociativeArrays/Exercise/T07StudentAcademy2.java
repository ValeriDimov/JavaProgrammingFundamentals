package AssociativeArrays.Exercise;

import java.util.*;

public class T07StudentAcademy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        Map<String, Double> studentsNewMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(student)) {
                studentsMap.put(student, new ArrayList<>());
                studentsMap.get(student).add(grade);
            } else {
                studentsMap.get(student).add(grade);
            }
        }
        studentsMap.entrySet().stream().forEach(stringListEntry -> {
            double totalGrade = 0;
            for (Double element : stringListEntry.getValue()) {
              totalGrade += element;
            }
            if (totalGrade / stringListEntry.getValue().size() >= 4.5) {
                studentsNewMap.put(stringListEntry.getKey(), totalGrade / stringListEntry.getValue().size());
            }
        });
        studentsNewMap
                .entrySet()
                .stream()
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(stringDoubleEntry -> System.out.printf("%s -> %.2f%n",
                        stringDoubleEntry.getKey(), stringDoubleEntry.getValue()));
    }
}
