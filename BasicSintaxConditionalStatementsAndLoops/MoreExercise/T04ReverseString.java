package BasicSintaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class T04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String oppositeWord = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            char symbol = word.charAt(i);
            oppositeWord += symbol;
        }
        System.out.println(oppositeWord);
    }
}
