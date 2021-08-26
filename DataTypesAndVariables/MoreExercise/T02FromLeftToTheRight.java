package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class T02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            int secondNum = 0;
            for (int j = input.length() - 1; j >= 0; j--) {
                if ((int) input.charAt(j) > 32 && (int) input.charAt(j) != 45) {
                    int tempNum = Integer.parseInt(String.valueOf(input.charAt(j)));
                    secondNum += tempNum;
                } else if ((int) input.charAt(j) == 45) {
                    secondNum = secondNum * -1;
                } else {
                    break;
                }
            }

            int firstNum = 0;
            for (int j = 0; j < input.length(); j++) {
                if ((int) input.charAt(j) > 32 && (int) input.charAt(j) != 45) {
                    int tempNum = Integer.parseInt(String.valueOf(input.charAt(j)));
                    ;
                    firstNum += tempNum;
                } else if ((int) input.charAt(j) == 45) {
                    firstNum = firstNum * -1;
                } else {
                    break;
                }
            }
            if (secondNum >= firstNum) {
                System.out.println(secondNum);
            } else {
                System.out.println(firstNum);
            }
        }
    }
}
