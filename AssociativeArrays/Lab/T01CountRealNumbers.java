package AssociativeArrays.Lab;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class T01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Double> numberList = Arrays
                .stream(input.split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> numbersCollection = new TreeMap<>();

        for (int i = 0; i < numberList.size(); i++) {
            if (!numbersCollection.containsKey(numberList.get(i))) {
                numbersCollection.put(numberList.get(i), 1);
            } else {
                int countNumberKey = numbersCollection.get(numberList.get(i));
                numbersCollection.put(numberList.get(i), countNumberKey + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbersCollection.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
//        numbersCollection.entrySet().forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));
    }
}
