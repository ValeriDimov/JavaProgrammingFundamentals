package BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";
        String password = scanner.nextLine();
        int counter = 1;
        boolean flag = false;

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            correctPassword += symbol;
        }

        while (!password.equals(correctPassword)) {
            counter++;
            System.out.println("Incorrect password. Try again.");
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                flag = true;
                break;
            }

            password = scanner.nextLine();
        }
        if (!flag) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
