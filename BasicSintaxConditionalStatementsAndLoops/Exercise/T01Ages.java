package BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String personType = "";

        if (age >= 0 && age <= 2) {
            personType = "baby";
        }else if (age <= 13) {
            personType = "child";
        } else if (age <= 19) {
            personType = "teenager";
        } else if (age <= 65) {
            personType = "adult";
        } else {
            personType = "elder";
        }
        System.out.println(personType);
    }
}
