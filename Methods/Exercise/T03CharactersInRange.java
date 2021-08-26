package Methods.Exercise;

import java.util.Scanner;

public class T03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        getSymbolsBetweenThem(firstSymbol, secondSymbol);

    }

    private static void getSymbolsBetweenThem(char firstSymbol, char secondSymbol) {

        if (firstSymbol < secondSymbol) {
            for (char symbol1 = (char)(firstSymbol + 1); symbol1 < secondSymbol; symbol1++) {
                System.out.print(symbol1 + " ");
            }
        } else {
            for (char symbol1 = (char)(secondSymbol + 1); symbol1 < firstSymbol; symbol1++) {
                System.out.print(symbol1 + " ");
            }
        }
    }
}
