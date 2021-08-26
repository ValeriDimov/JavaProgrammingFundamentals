package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        double carsHorsePowerSum = 0;
        double trucksHorsePowerSum = 0;
        int carsCounter = 0;
        int trucksCounter = 0;


        while (!input.equals("End")) {
            String[] inputArray = input.split("\\s+");
            Vehicle vehicle = new Vehicle(inputArray[0], inputArray[1], inputArray[2], Double.parseDouble(inputArray[3]));
            vehicleList.add(vehicle);
            switch (inputArray[0]) {
                case "car":
                    carsHorsePowerSum += Double.parseDouble(inputArray[3]);
                    carsCounter++;
                    vehicle.setTypeOfVehicle("Car");
                    break;
                case "truck":
                    trucksHorsePowerSum += Double.parseDouble(inputArray[3]);
                    trucksCounter++;
                    vehicle.setTypeOfVehicle("Truck");
                    break;
            }
            input = scanner.nextLine();
        }
        String modelsInput = scanner.nextLine();

        while (!modelsInput.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (modelsInput.equals(vehicle.getModelOfVehicle())) {
                    System.out.printf("Type: %s%n", vehicle.getTypeOfVehicle());
                    System.out.printf("Model: %s%n", vehicle.getModelOfVehicle());
                    System.out.printf("Color: %s%n", vehicle.getColorOfVehicle());
                    System.out.printf("Horsepower: %.0f%n", vehicle.getHorsepowerOfVehicle());
                }
            }

            modelsInput = scanner.nextLine();
        }
        if (carsCounter == 0) {
            System.out.printf("Cars have average horsepower of: 0.00.%n");
            System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksHorsePowerSum / trucksCounter);
        } else if (trucksCounter == 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsHorsePowerSum / carsCounter);
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsHorsePowerSum / carsCounter);
            System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksHorsePowerSum / trucksCounter);
        }
    }
}
