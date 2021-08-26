package AssociativeArrays.Exercise;

import java.util.*;

public class T06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> studentsInCourseMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] inputArray = input.split(" : ");
            String course = inputArray[0];
            String student = inputArray[1];

            if (!studentsInCourseMap.containsKey(course)) {
                studentsInCourseMap.put(course, new ArrayList<>());
                studentsInCourseMap.get(course).add(student);
            } else {
                studentsInCourseMap.get(course).add(student);
            }
            input = scanner.nextLine();
        }
        studentsInCourseMap.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                //сортира курсовете(ключовете) по брой хора (descending order / намаляващ ред)
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                    //ascending order / нарастващ ред
                });

    }
}

