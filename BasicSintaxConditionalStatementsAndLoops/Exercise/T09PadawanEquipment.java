package BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabresPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double totalSabresPrice = Math.ceil(students * 1.1) * sabresPrice;
        double totalRobesPrice = students * robesPrice;
        double totalBeltPrice = 0;

        if (students < 6) {
            totalBeltPrice = students * beltsPrice;
        } else {
            totalBeltPrice = (students * beltsPrice) - (Math.floor(students / 6) * beltsPrice);
        }
        double totalPrice = totalSabresPrice + totalRobesPrice + totalBeltPrice;

       if (budget >= totalPrice) {
           System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
       } else {
           System.out.printf("George Lucas will need %.2flv more.", (totalPrice - budget));
       }
    }
}
