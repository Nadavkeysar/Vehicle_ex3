import java.util.concurrent.locks.ReentrantLock;

public class VehicleAgency {
    private List<Vehicle> inventory = new ArrayList<>();
    private ReentrantLock inventoryLock = new ReentrantLock();

    // Additional attributes and methods, like adding and removing vehicles...
}
