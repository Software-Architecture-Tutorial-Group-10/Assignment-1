public class TestDriver {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory & Factory Method Demo ===");

        // Brand A Bulb
        smartDeviceFactory factoryA = new brandAFactory();
        Bulb bulbA = factoryA.createBulb();
        bulbA.setPowerUsageFromFile("dataFiles/brandA_bulb.txt");
        System.out.println("Brand A Bulb:");
        bulbA.displayInfo();

        // Brand B Lock
        smartDeviceFactory factoryB = new brandBFactory();
        Lock lockB = factoryB.createLock();
        lockB.setBatteryUsageFromFile("dataFiles/brandB_lock.txt");
        System.out.println("\nBrand B Lock:");
        lockB.displayInfo();
    }
}
