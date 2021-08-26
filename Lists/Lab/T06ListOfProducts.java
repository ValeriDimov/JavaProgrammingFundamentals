package Lists.Lab;

import java.util.*;

public class T06ListOfProducts {
    private static Object Comparator;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
