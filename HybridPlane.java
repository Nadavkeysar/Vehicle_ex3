public class HybridPlane extends Vehicle implements AirVehicle, LandVehicle, SeaVehicle {
    public HybridPlane(String name, double fuelConsumption) {
        super(name, fuelConsumption);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving.");
    }

    @Override
    public void sail() {
        System.out.println(getName() + " is sailing.");
    }

    @Override
    public String toString() {
        return "HybridPlane [name=" + getName() + ", fuel consumption=" + getFuelConsumption() + "]";
    }
}
