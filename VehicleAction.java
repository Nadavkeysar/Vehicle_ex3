
public abstract class VehicleAction implements Runnable {
    protected Vehicle vehicle;
    protected VehicleAgency agency;

    public VehicleAction(Vehicle vehicle, VehicleAgency agency) {
        this.vehicle = vehicle;
        this.agency = agency;
    }

    @Override
    public abstract void run();
}
