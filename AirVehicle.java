
public abstract class AirVehicle extends Vehicle {
    private String usage;

    public AirVehicle(String model, int maxPassengers, double maxSpeed, String usage) {
        super(model, maxPassengers, maxSpeed);
        this.usage = usage;
    }

    public String getUsage() {
        return usage;
    }
}
