package ObjectsAndClasses.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Students> studentsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split("\\s+");
            Students students = new Students(inputArray[0], inputArray[1], Double.parseDouble(inputArray[2]));
            studentsList.add(students);

         }
        List<Students> sorted = studentsList.stream().sorted(Comparator.comparingDouble(Students::getGrade))
                .collect(Collectors.toList());
        Collections.reverse(sorted);

        for (Students students : sorted) {
            System.out.println(students.toString());
        }

    }
}
