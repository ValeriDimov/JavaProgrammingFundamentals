package ObjectsAndClasses.Exercise;

public class Vehicle {
    private String typeOfVehicle;

    private String modelOfVehicle;

    private String colorOfVehicle;
    private double horsepowerOfVehicle;
    public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, double horsepowerOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return colorOfVehicle;
    }

    public double getHorsepowerOfVehicle() {
        return horsepowerOfVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typeOfVehicle='" + typeOfVehicle + '\'' +
                ", modelOfVehicle='" + modelOfVehicle + '\'' +
                ", colorOfVehicle='" + colorOfVehicle + '\'' +
                ", horsepowerOfVehicle=" + horsepowerOfVehicle +
                '}';
    }
}
