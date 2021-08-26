package TextProcessing.Exercise;

import java.util.Scanner;

public class T01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userNames = scanner.nextLine();
        String[] userNamesArray = userNames.split(", ");

        for (String userName : userNamesArray) {
            if (isValid(userName)) {
                System.out.println(userName);
            }
        }
    }
    private static boolean isValid(String userName) {
        if (userName.length() < 3 || userName.length() > 16) {
            return false;
        }
        for (int i = 0; i < userName.length(); i++) {
            char symbol = userName.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
