/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class AmphibiousVechile extends LandVehicle implements Motorized {

    public AmphibiousVechile(String model, int maxPassengers, double maxSpeed, int numberOfWheels, String roadType) {
        super(model, maxPassengers, maxSpeed, numberOfWheels, roadType);
    }

    @Override
    public void setAverageFuelConsumption(double averageFuelConsumption) {

    }

    @Override
    public double getAverageFuelConsumption() {
        return 0;
    }

    @Override
    public void setEngineLifetime(double engineLifetime) {

    }

    @Override
    public double getEngineLifetime() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
