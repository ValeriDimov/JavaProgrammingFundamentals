package BasicSintaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int newMinutes = minutes + 30;

        if (newMinutes >= 60) {
            newMinutes = newMinutes - 60;
            hours += 1;
            if (hours == 24) {
                hours = 0;
            }
        }
        System.out.printf("%d:%02d", hours, newMinutes);
    }
}
