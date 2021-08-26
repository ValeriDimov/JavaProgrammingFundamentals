package AssociativeArrays.Exercise;

import java.util.*;

public class T04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Double>> productMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] inputArray = input.split("\\s+");
            String currentProduct = inputArray[0];
            double price = Double.parseDouble(inputArray[1]);
            double quantity = Double.parseDouble(inputArray[2]);

            if (!productMap.containsKey(currentProduct)) {
                productMap.put(currentProduct, new ArrayList<>());
                productMap.get(currentProduct).add(price);
                productMap.get(currentProduct).add(quantity);
            } else {
                double currentProductQuantity = productMap.get(currentProduct).get(1);
                double currentProductPrice = productMap.get(currentProduct).get(0);
                productMap.get(currentProduct).set(1, quantity + currentProductQuantity);
                productMap.get(currentProduct).set(0, price);
            }
            input = scanner.nextLine();
        }
        productMap.entrySet()
                .stream()
                .forEach(stringListEntry ->
                        System.out.printf("%s -> %.2f%n", stringListEntry.getKey(),
                                stringListEntry.getValue().get(0) * stringListEntry.getValue().get(1)));
    }
}
