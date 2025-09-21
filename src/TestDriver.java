public class TestDriver {
    public static void main(String[] args) {
        // Brand A Factory
        SmartDeviceFactory brandAFactory = new BrandAFactory();
        Bulb brandABulb = brandAFactory.createBulb();
        Lock brandALock = brandAFactory.createLock();

        // Brand B Factory
        SmartDeviceFactory brandBFactory = new BrandBFactory();
        Bulb brandBBulb = brandBFactory.createBulb();
        Lock brandBLock = brandBFactory.createLock();

        // Print results
        System.out.println("=== Brand A Devices ===");
        System.out.println("Bulb usage: " + brandABulb.getUsage());
        System.out.println("Lock usage: " + brandALock.getUsage());

        System.out.println("\n=== Brand B Devices ===");
        System.out.println("Bulb usage: " + brandBBulb.getUsage());
        System.out.println("Lock usage: " + brandBLock.getUsage());
    }
}
