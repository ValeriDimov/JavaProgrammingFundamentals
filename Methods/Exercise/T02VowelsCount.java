package Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class T02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        getCountOfVowels(input);
    }

    private static void getCountOfVowels(String input) {
        int countVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    countVowels++;
                    break;
            }
        }
        System.out.println(countVowels);
    }
}
