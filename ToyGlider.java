
public class ToyGlider extends AirVehicle implements NonMotorized {
    private String powerSource;
    private char energyScore;

    public ToyGlider(double distance, double maxSpeed) {
        super("toy", 0, 10, "civilian");
        this.powerSource = "manual";
        this.energyScore = 'A';
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
        return "ToyGlider: Model: " + getModel() + ", traveled: " + getDistance() + " Km, Max speed of " + getMaxSpeed() + " Mph, can carry max of " + getMaxPassengers() + " people. Usage: " + getUsage() + ", Power source: " + powerSource + ", Energy score: " + energyScore + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ToyGlider)
        {
            ToyGlider other = (ToyGlider) obj;
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