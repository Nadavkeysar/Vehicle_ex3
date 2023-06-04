
public class Frigate extends SeaVehicle implements Motorized {
    private double averageFuelConsumption;
    private double engineLifetime;

    public Frigate(String model, int maxPassengers, double maxSpeed, boolean withWind) {
        super(model, maxPassengers, maxSpeed, "Israel", withWind);
        this.averageFuelConsumption = 500;
        this.engineLifetime = 4;
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
        return "Frigate: Model: " + getModel() + ", traveled: " + getDistance() + " Km, Max speed of " + getMaxSpeed() + " Mph, can carry max of " + getMaxPassengers() + " people. Under " + getFlag() + " flag, " + (isWithWind() ? "with the wind." : "against the wind.") + " Engine: " + averageFuelConsumption + "L, lifetime of " + engineLifetime + " years.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Frigate) {
            Frigate other = (Frigate) obj;
            return getModel().equals(other.getModel()) &&
                    getMaxSpeed() == other.getMaxSpeed() &&
                    getMaxPassengers() == other.getMaxPassengers() &&
                    getFlag().equals(other.getFlag()) &&
                    isWithWind() == other.isWithWind() &&
                    averageFuelConsumption == other.averageFuelConsumption &&
                    engineLifetime == other.engineLifetime;
        }
        return false;
    }
}
