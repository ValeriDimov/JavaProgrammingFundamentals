package Lists.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> partyPeople = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] peopleMayGo = input.split("\\s+");
           switch (peopleMayGo[2]) {
               case "going!":
                   if (!partyPeople.contains(peopleMayGo[0])) {
                       partyPeople.add(peopleMayGo[0]);
                   } else {
                       System.out.printf("%s is already in the list!%n", peopleMayGo[0]);
                   }
                   break;
               case "not":
                   if (partyPeople.contains(peopleMayGo[0])) {
                       partyPeople.remove(String.valueOf(peopleMayGo[0]));
                   } else {
                       System.out.printf("%s is not in the list!%n", peopleMayGo[0]);
                   }
                   break;
           }

        }
        for (String temp : partyPeople) {
            System.out.println(temp + " ");
        }

    }
}
