package Exams.Final;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toConcurrentMap;
import static java.util.stream.Collectors.toMap;

public class T03HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String heroes = scanner.nextLine();
            String[] heroesArray = heroes.split("\\s+");
            String currentHeroName = heroesArray[0];
            int currentHitPoints = Integer.parseInt(heroesArray[1]);
            int currentManaPoints = Integer.parseInt(heroesArray[2]);

            heroesMap.put(currentHeroName, new ArrayList<>());
            heroesMap.get(currentHeroName).add(currentHitPoints);
            heroesMap.get(currentHeroName).add(currentManaPoints);

        }
        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] commandsArray = commands.split(" - ");
            String currentCommand = commandsArray[0];
            String heroName = commandsArray[1];
            int amount = Integer.parseInt(commandsArray[2]);

            switch (currentCommand) {
                case "CastSpell":
                    String spellName = commandsArray[3];
                    if (heroesMap.get(heroName).get(1) >= amount) {
                        int tempMana = heroesMap.get(heroName).get(1);
                        heroesMap.get(heroName).set(1, tempMana - amount);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroesMap.get(heroName).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    String attacker = commandsArray[3];
                    int tempHP = heroesMap.get(heroName).get(0);
                    heroesMap.get(heroName).set(0, tempHP - amount);
                    if (heroesMap.get(heroName).get(0) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, amount, attacker, heroesMap.get(heroName).get(0));
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesMap.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int tempMana = heroesMap.get(heroName).get(1);
                    if (tempMana + amount > 200) {
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - tempMana);
                        heroesMap.get(heroName).set(1, 200);
                    } else {
                        heroesMap.get(heroName).set(1, tempMana + amount);
                        System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                    }
                    break;
                case "Heal":
                    int tempHPNew = heroesMap.get(heroName).get(0);
                    if (tempHPNew + amount > 100) {
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - tempHPNew);
                        heroesMap.get(heroName).set(0, 100);
                    } else {
                        heroesMap.get(heroName).set(0, tempHPNew + amount);
                        System.out.printf("%s healed for %d HP!%n", heroName, amount);
                    }
                    break;
            }

            commands = scanner.nextLine();
            String HP = "HP";
        }
        Map<String, Integer> hitPointsMap = new TreeMap<>();
        heroesMap.entrySet().forEach(stringListEntry -> {
            hitPointsMap.put(stringListEntry.getKey(), stringListEntry.getValue().get(0));
        });
        Map<String, Integer> manaPointsMap = new TreeMap<>();
        heroesMap.entrySet().forEach(stringListEntry -> {
            manaPointsMap.put(stringListEntry.getKey(), stringListEntry.getValue().get(1));
        });
        hitPointsMap
                .entrySet()
                .stream()
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(stringIntegerEntry -> {
                    String heroName = stringIntegerEntry.getKey();
                    System.out.println(stringIntegerEntry.getKey());
                    System.out.printf("HP: %d%n", stringIntegerEntry.getValue());
                    System.out.printf("MP: %d%n", manaPointsMap.get(heroName));
                });

    }
}
