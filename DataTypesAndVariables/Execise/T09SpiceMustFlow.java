package DataTypesAndVariables.Execise;

import java.util.Scanner;

public class T09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int spice = 0;
        boolean flag = false;

        for (int i = yield; i >= 100; i -= 10) {
            spice += (i - 26);
            countDays++;
            flag = true;
        }
        if (flag) {
            spice -= 26;
        } else {
//            spice = yield - 2 * 26;
            //countDays++;
        }
        System.out.println(countDays);
        System.out.println(spice);
    }
}
