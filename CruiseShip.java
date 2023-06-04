/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CruiseShip extends SeaVehicle implements Motorized,Commercial{
    private double averageFuelConsumption;
    private double engineLifetime;
    String licenseType;

    public CruiseShip(String model, int maxPassengers, double maxSpeed, String flag) {
        super(model,maxPassengers,maxSpeed,flag,true);
       this.averageFuelConsumption = 500;
        this.engineLifetime = 4;
        licenseType = "unlimited";
    }
    

    @Override
    public String toString() {
        return "CruiseShip: Model: " + getModel() +  " Km, Max speed of " + getMaxSpeed() + " Mph, can carry max of " + getMaxPassengers() + " flag " + getFlag() +".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CruiseShip) {
            CruiseShip other = (CruiseShip) obj;
            return getModel().equals(other.getModel()) &&
                    getMaxSpeed() == other.getMaxSpeed() &&
                    getMaxPassengers() == other.getMaxPassengers();
     }              
        return false;
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
    public void setLicenseType(String licenseType) {
            this.licenseType = licenseType;
    }

    @Override
    public String getLicenseType() {
        return licenseType;
    }

}