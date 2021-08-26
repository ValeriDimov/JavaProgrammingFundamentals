package Exams.Final;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> goldMap = new TreeMap<>();
        Map<String, Integer> populationMap = new TreeMap<>();

        while (!input.equals("Sail")) {
            String[] inputArray = input.split("[|][|]");
            String city = inputArray[0];
            int population = Integer.parseInt(inputArray[1]);
            int gold = Integer.parseInt(inputArray[2]);

            if (goldMap.containsKey(city)) {
                int toAddGold = goldMap.get(city);
                int toAddPopulation = populationMap.get(city);
                goldMap.put(city, gold + toAddGold);
                populationMap.put(city, toAddPopulation + population);
            } else {
                goldMap.put(city, gold);
                populationMap.put(city, population);
            }

            input = scanner.nextLine();
        }
        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] commandsArray = commands.split("=>");
            String currentCommand = commandsArray[0];
            String town = commandsArray[1];

            switch (currentCommand) {
                case "Plunder":
                    int currentPopulation = Integer.parseInt(commandsArray[2]);
                    int currentGold = Integer.parseInt(commandsArray[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, currentGold, currentPopulation);
                    int tempGold = goldMap.get(town);
                    int tempPopulation = populationMap.get(town);

                    goldMap.put(town, tempGold - currentGold);
                    if (goldMap.get(town) <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        goldMap.remove(town);
                        populationMap.remove(town);
                    }
                    populationMap.put(town, tempPopulation - currentPopulation);
                    if (populationMap.get(town) <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        goldMap.remove(town);
                        populationMap.remove(town);
                    }
                    break;
                case "Prosper":
                    currentGold = Integer.parseInt(commandsArray[2]);
                    if (currentGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        tempGold = goldMap.get(town);
                        goldMap.put(town, tempGold + currentGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", currentGold, town, goldMap.get(town));
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        int counter = goldMap.size();
        if (counter == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", counter);
            goldMap
                    .entrySet()
                    .stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(myTown -> {
                        String tempTown = myTown.getKey();
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", myTown.getKey(), populationMap.get(tempTown), myTown.getValue());
            });
        }
    }
}
