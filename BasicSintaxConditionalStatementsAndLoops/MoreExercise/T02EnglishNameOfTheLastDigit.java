package BasicSintaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class T02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String ofNumber = "" + n;
        char name = ofNumber.charAt(ofNumber.length() - 1);

        String word = "";

        switch (name) {
            case '0':
                word = "zero";
                break;
            case '1':
                word = "one";
                break;
                case '2':
                word = "two";
                break;
                case '3':
                word = "three";
                break;
                case '4':
                word = "four";
                break;
                case '5':
                word = "five";
                break;
                case '6':
                word = "six";
                break;
                case '7':
                word = "seven";
                break;
                case '8':
                word = "eight";
                break;
                case '9':
                word = "nine";
                break;
        }
        System.out.println(word);
    }
}
