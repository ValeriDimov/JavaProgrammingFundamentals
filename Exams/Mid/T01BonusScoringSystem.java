package Exams.Mid;

import java.util.Scanner;

public class T01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double maximumBonus = 0;
//        {total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        double totalBonus = 0;
        int maxBonusStudentAttendances = 0;

        for (int i = 1; i <= studentsCount; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            totalBonus = 1.0 * attendances / lecturesCount * (5 + initialBonus);

            if (maximumBonus < totalBonus) {
                maximumBonus = totalBonus;
                maxBonusStudentAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maximumBonus));
        System.out.printf("The student has attended %d lectures.", maxBonusStudentAttendances);
    }
}
