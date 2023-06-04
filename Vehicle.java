import java.util.Objects;

public abstract class Vehicle {
    private String name;
    private double fuelConsumption;

    public Vehicle(String name, double fuelConsumption) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
    }

    // Additional attributes and methods...

    @Override
    public String toString() {
        return "Vehicle [name=" + name + ", fuel consumption=" + fuelConsumption + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Vehicle vehicle = (Vehicle) obj;
        return Double.compare(vehicle.fuelConsumption, fuelConsumption) == 0 &&
               name.equals(vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fuelConsumption);
    }
}
