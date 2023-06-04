
public class Jeep extends LandVehicle implements Motorized, Commercial {
    private String licenseType;
    private double averageFuelConsumption;
    private double engineLifetime;


    public Jeep(String model, double averageFuelConsumption, double maxSpeed, double engineLifetime) {
        super(model, 5, maxSpeed, 4, "dirt");
        this.licenseType = "MINI";
        this.averageFuelConsumption = averageFuelConsumption;
        this.engineLifetime = engineLifetime;
    }

    @Override
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public String getLicenseType() {
        return licenseType;
    }

    @Override
    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    @Override
    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    @Override
    public void setEngineLifetime(double engineLifetime) {
        this.engineLifetime = engineLifetime;
    }

    @Override
    public double getEngineLifetime() {
        return engineLifetime;
    }

    @Override
    public String toString() {
        return "Jeep: Model: " + getModel() + ", traveled: " + getDistance() + " Km, Max speed of " + getMaxSpeed() + " Mph, can carry max of " + getMaxPassengers() + " people. License type: " + licenseType + ", Engine: " + averageFuelConsumption + "L, lifetime of " + engineLifetime + " years.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jeep) {
            Jeep other = (Jeep) obj;
            return getModel().equals(other.getModel()) &&
                    getMaxSpeed() == other.getMaxSpeed() &&
                    getMaxPassengers() == other.getMaxPassengers() &&
                    licenseType.equals(other.licenseType) &&
                    averageFuelConsumption == other.averageFuelConsumption &&
                    engineLifetime == other.engineLifetime;
        }
        return false;
    }
}