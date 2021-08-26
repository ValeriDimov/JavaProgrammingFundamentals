package Exams.Mid;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> arrayList = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] commandArray = commands.split("\\s+");
            String command = commandArray[0];
            int index1 = 0;
            int index2 = 0;
            switch (command) {
                case "swap":
                    index1 = Integer.parseInt(commandArray[1]);
                    index2 = Integer.parseInt(commandArray[2]);
                    int resultIndex1 = arrayList.get(index1);
                    int resultIndex2 = arrayList.get(index2);
                    arrayList.set(index2, resultIndex1);
                    arrayList.set(index1, resultIndex2);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commandArray[1]);
                    index2 = Integer.parseInt(commandArray[2]);
                    int multipliedResult = arrayList.get(index1) * arrayList.get(index2);
                    arrayList.set(index1, multipliedResult);
                    break;
                case "decrease":
                    for (int i = 0; i < arrayList.size(); i++) {
                        int value = arrayList.get(i) - 1;
                        arrayList.set(i, value);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        String[] output = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            output[i] = "" + arrayList.get(i);
        }
        System.out.println(String.join(", ", output));
    }
}
