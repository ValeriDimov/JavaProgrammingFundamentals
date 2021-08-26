package Exams.Final;

import javax.swing.plaf.ColorUIResource;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T03NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carMileageMap = new TreeMap<>();
        Map<String, Integer> carFuelMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String carsInfo = scanner.nextLine();
            String[] carInfoArray = carsInfo.split("\\|");
            String car = carInfoArray[0];
            int mileage = Integer.parseInt(carInfoArray[1]);
            int fuel = Integer.parseInt(carInfoArray[2]);
            carMileageMap.put(car, mileage);
            carFuelMap.put(car, fuel);

        }
        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            String[] commandsArray = commands.split(" : ");
            String currentCommand = commandsArray[0];
            String currentCar = commandsArray[1];

            switch (currentCommand) {
                case "Drive":
                    int currentDistance = Integer.parseInt(commandsArray[2]);
                    int currentFuel = Integer.parseInt(commandsArray[3]);

                    if (carFuelMap.get(currentCar) <= currentFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int tempMileage = carMileageMap.get(currentCar);
                        int tempFuel = carFuelMap.get(currentCar);
                        carMileageMap.put(currentCar, currentDistance + tempMileage);
                        carFuelMap.put(currentCar, tempFuel - currentFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", currentCar, currentDistance, currentFuel);
                    }
                    if (carMileageMap.get(currentCar) >= 100000) {
                        carMileageMap.remove(currentCar);
                        carFuelMap.remove(currentCar);
                        System.out.printf("Time to sell the %s!%n", currentCar);
                    }
                    break;
                case "Refuel":
                    int currentFuel2 = Integer.parseInt(commandsArray[2]);
                    int tempFuel2 = carFuelMap.get(currentCar);
                    if ((tempFuel2 + currentFuel2) > 75) {
                        carFuelMap.put(currentCar, 75);
                        System.out.printf("%s refueled with %d liters%n", currentCar, 75 - tempFuel2);
                    } else {
                        carFuelMap.put(currentCar, currentFuel2 + tempFuel2);
                        System.out.printf("%s refueled with %d liters%n", currentCar, currentFuel2);
                    }
                    break;
                case "Revert":
                    int currentDistance2 = Integer.parseInt(commandsArray[2]);
                    int tempMileage2 = carMileageMap.get(currentCar);
                    if ((tempMileage2 - currentDistance2) < 10000) {
                        carMileageMap.put(currentCar, 10000);
                    } else {
                        carMileageMap.put(currentCar, tempMileage2 - currentDistance2);
                        System.out.printf("%s mileage decreased by %d kilometers%n", currentCar, currentDistance2);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        carMileageMap
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(car -> {
                    String tempCar = car.getKey();
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car.getKey(), car.getValue(), carFuelMap.get(tempCar));
                });
    }
}
