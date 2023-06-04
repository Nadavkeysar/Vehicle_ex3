
public class ElectricBicycle extends Vehicle implements LandVehicle {
    public ElectricBicycle(String name, double fuelConsumption) {
        super(name, fuelConsumption);
    }

    // Additional attributes and methods...

    @Override
    public void drive() {
        // Implementation...
    }

    @Override
    public String toString() {
        return "ElectricBicycle [name=" + getName() + ", fuel consumption=" + getFuelConsumption() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
