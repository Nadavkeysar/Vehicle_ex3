
public class SpyGlider extends AirVehicle implements NonMotorized {
    private String powerSource;
    private char energyScore;

    public SpyGlider(double distance, double maxSpeed) {
        super("classified", 1, 50, "military");
        this.powerSource = "unknown";
        this.energyScore = 'C';
    }

    @Override
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public String getPowerSource() {
        return powerSource;
    }

    @Override
    public void setEnergyScore(char energyScore) {
        this.energyScore = energyScore;
    }

    @Override
    public char getEnergyScore() {
        return energyScore;
    }

    @Override
    public String toString() {
        return "SpyGlider: Model: " + getModel() + ", traveled: " + getDistance() + " Km, Max speed of " + getMaxSpeed() + " Mph, can carry max of " + getMaxPassengers() + " people. Usage: " + getUsage() + ", Power source: " + powerSource + ", Energy score: " + energyScore + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SpyGlider) {
            SpyGlider other = (SpyGlider) obj;
            return getModel().equals(other.getModel()) &&
                    getMaxSpeed() == other.getMaxSpeed() &&
                    getMaxPassengers() == other.getMaxPassengers() &&
                    getUsage().equals(other.getUsage()) &&
                    powerSource.equals(other.powerSource) &&
                    energyScore == other.energyScore;
        }
        return false;
    }
}
