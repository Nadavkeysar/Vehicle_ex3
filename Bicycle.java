/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Bicycle extends LandVehicle implements NonMotorized {
    private String powerSource;
    private char energyScore;
    
    public Bicycle(String model,int maxPassengers, double maxSpeed, int numberOfWheels, String roadType) {
        super(model,2,maxSpeed,2,"road");
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
        return "Bicycle: Model: " + getModel() + ", traveled: " + getDistance() + " Km, Max speed of " + getMaxSpeed() + " Mph, can carry max of " + getMaxPassengers()  + ", Power source: " + powerSource + ", Energy score: " + energyScore + ".";
    }

      @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jeep) {
             Bicycle other = (Bicycle) obj;
            return getModel().equals(other.getModel()) &&
                    getMaxSpeed() == other.getMaxSpeed() &&
                    getMaxPassengers() == other.getMaxPassengers();
        }
        return false;
    }
}
