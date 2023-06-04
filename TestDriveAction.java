public class TestDriveAction extends VehicleAction {
    private double distance;

    public TestDriveAction(Vehicle vehicle, VehicleAgency agency, double distance) {
        super(vehicle, agency);
        this.distance = distance;
    }

    @Override
    public void run() {
        try {
            // Delay for distance * 100 ms
            Thread.sleep((long)(distance * 100));

            // Drive the vehicle (implementation will depend on vehicle type)
            if (vehicle instanceof LandVehicle) {
                ((LandVehicle)vehicle).drive();
            }
            else if (vehicle instanceof AirVehicle) {
                ((AirVehicle)vehicle).fly();
            }
            else if (vehicle instanceof SeaVehicle) {
                ((SeaVehicle)vehicle).sail();
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
