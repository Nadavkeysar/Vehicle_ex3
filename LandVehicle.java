
public abstract class LandVehicle extends Vehicle {
    private int numberOfWheels;
    private String roadType;

    public LandVehicle(String model, int maxPassengers, double maxSpeed, int numberOfWheels, String roadType) {
        super(model, maxPassengers, maxSpeed);
        this.numberOfWheels = numberOfWheels;
        this.roadType = roadType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getRoadType() {
        return roadType;
    }
}
