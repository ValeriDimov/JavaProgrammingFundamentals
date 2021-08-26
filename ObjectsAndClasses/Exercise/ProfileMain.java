package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProfileMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Profile> profileList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputArray = input.split("\\s+");
            Profile profile = new Profile(inputArray[0], inputArray[1], Integer.parseInt(inputArray[2]));
            profileList.add(profile);
            input = scanner.nextLine();
        }

        List<Profile> sorted = profileList.stream().sorted(Comparator.comparingInt(Profile::getAge))
                .collect(Collectors.toList());

        for (Profile temp : sorted) {
            System.out.println(temp.toString());
        }
    }
}
