package Exams.Final;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class T03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarityMap = new HashMap<>();
        Map<String, List<Integer>> plantRatingsMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String plantsPlusRarity = scanner.nextLine();
            String[] plantsPlusRarityArray = plantsPlusRarity.split("<->");
            String currentPlant = plantsPlusRarityArray[0];
            int currentRarity = Integer.parseInt(plantsPlusRarityArray[1]);
            plantRarityMap.put(currentPlant, currentRarity);
        }
        String commands = scanner.nextLine();
        while (!commands.equals("Exhibition")) {
            String[] commandsArray = commands.split(":| - ");
            String currentCommand = commandsArray[0];

            if (!currentCommand.equals("Rate") && !currentCommand.equals("Update") && !currentCommand.equals("Reset")) {
                System.out.println("error");
                continue;
            }
            String currentPlant = commandsArray[1].trim();

            switch (currentCommand) {
                case "Rate":
                    int currentRatingOrRarity = Integer.parseInt(commandsArray[2]);
                    if (plantRatingsMap.containsKey(currentPlant)) {
                        plantRatingsMap.get(currentPlant).add(currentRatingOrRarity);
                    } else {
                        plantRatingsMap.put(currentPlant, new ArrayList<>());
                        plantRatingsMap.get(currentPlant).add(currentRatingOrRarity);
                    }
                    break;
                case "Update":
                    currentRatingOrRarity = Integer.parseInt(commandsArray[2]);
                    plantRarityMap.put(currentPlant, currentRatingOrRarity);
                    break;
                case "Reset":
                    plantRatingsMap.get(currentPlant).clear();
                    plantRatingsMap.get(currentPlant).add(0);

                    break;

            }

            commands = scanner.nextLine();
        }
        Map<String, Double> plantRatingNewMap = new HashMap<>();

        plantRatingsMap
                .entrySet()
                .stream()
                .forEach(plant -> {
                    double totalRating = 0;
                    for (Integer element : plant.getValue()) {
                        totalRating += element;
                    }
                    double averageRating = totalRating / plant.getValue().size();
                    plantRatingNewMap.put(plant.getKey(), averageRating);
                });
        Map<String, Double> sortedMap = plantRatingNewMap
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                HashMap::new));

        System.out.println("Plants for the exhibition:");
        plantRarityMap
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(plant -> {
                    String tempPlant = plant.getKey();
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant.getKey(), plant.getValue(), sortedMap.get(tempPlant));
                });
    }
}
