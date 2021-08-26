package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] inputArray = input.split("\\s+");
            Student student = new Student(inputArray[0], inputArray[1], Integer.parseInt(inputArray[2]), inputArray[3]);
            studentList.add(student);

            input = scanner.nextLine();
        }
        String inputCity = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHomeTown().equals(inputCity)) {
                System.out.println(student.toString());
            }
        }
    }
}
