public class TestDriver {
    public static void main(String[] args) {
        // Brand A Factory
        smartDeviceFactory brandAFactory = new brandAFactory();
        Bulb brandABulb = brandAFactory.createBulb();
        Lock brandALock = brandAFactory.createLock();

        // Load values from files (or add setters for testing)
        brandABulb.setPowerUsageFromFile("dataFiles/brandA_bulb.txt");
        brandALock.setBatteryUsageFromFile("dataFiles/brandA_lock.txt");

        // Brand B Factory
        smartDeviceFactory brandBFactory = new brandBFactory();
        Bulb brandBBulb = brandBFactory.createBulb();
        Lock brandBLock = brandBFactory.createLock();

        brandBBulb.setPowerUsageFromFile("dataFiles/brandB_bulb.txt");
        brandBLock.setBatteryUsageFromFile("dataFiles/brandB_lock.txt");

        // Print results
        System.out.println("=== Brand A Devices ===");
        System.out.print("Bulb usage: ");
        brandABulb.displayInfo();
        System.out.print("Lock usage: ");
        brandALock.displayInfo();

        System.out.println("\n=== Brand B Devices ===");
        System.out.print("Bulb usage: ");
        brandBBulb.displayInfo();
        System.out.print("Lock usage: ");
        brandBLock.displayInfo();
    }
}
