package TextProcessing.Exercise;

import java.util.Scanner;

public class T02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");
        String str1 = inputArray[0];
        String str2 = inputArray[1];

        if (str1.length() == str2.length()) {
            int result1 = getMultipliedChars(str1, str2);
            System.out.println(result1);
        } else if (str1.length() > str2.length()) {
            int result1 = getMultipliedChars(str2, str1);
            for (int i = str2.length(); i < str1.length(); i++) {
                result1 += str1.charAt(i);
            }
            System.out.println(result1);
        } else {
            int result2 = getMultipliedChars(str1, str2);
            for (int i = str1.length(); i < str2.length(); i++) {
                result2 += str2.charAt(i);
            }
            System.out.println(result2);
        }
    }

    private static int getMultipliedChars(String str1, String str2) {
        int multipliedChars = 0;
        for (int i = 0; i < str1.length(); i++) {
            multipliedChars += str1.charAt(i) * str2.charAt(i);
        }
        return multipliedChars;
    }
}
