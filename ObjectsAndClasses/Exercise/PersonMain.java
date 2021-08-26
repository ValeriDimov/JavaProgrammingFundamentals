package ObjectsAndClasses.Exercise;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split("\\s+");
            Person person = new Person(inputArray[0], Integer.parseInt(inputArray[1]));
            personList.add(person);
        }
        List<Person> sorted = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        for (Person person : sorted) {
            if (person.getAge() > 30) {
                System.out.println(person.toString());
            }
        }
    }
}
