package Arrays.MoreExercise;

import java.util.Scanner;

public class T01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] name = new String[n];
        int[] numArray = new int[n];
        int minSum = 0;

        for (int i = 0; i < n; i++) {
            name[i] = scanner.nextLine();
            int capLetters = 0;
            int sumOfChars = 0;
            int totalSum = 0;

            for (int j = 0; j < name[i].length(); j++) {
                switch (name[i].charAt(j)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        capLetters += name[i].charAt(j) * name[i].length();
                        break;
                    default:
                        sumOfChars += name[i].charAt(j) / name[i].length();
                        break;
                }
                totalSum = capLetters + sumOfChars;

            }
            numArray[i] = totalSum;
        }
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    minSum = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = minSum;
                }
            }
        }
        for (int temp : numArray) {
            System.out.println(temp + " ");
        }
    }
}
