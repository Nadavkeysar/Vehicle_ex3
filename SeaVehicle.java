
public abstract class SeaVehicle extends Vehicle {
    private String flag;
    private boolean withWind;

    public SeaVehicle(String model, int maxPassengers, double maxSpeed, String flag, boolean withWind) {
        super(model, maxPassengers, maxSpeed);
        this.flag = flag;
        this.withWind = withWind;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public boolean isWithWind() {
        return withWind;
    }

    public void setWithWind(boolean withWind) {
        this.withWind = withWind;
    }
}
