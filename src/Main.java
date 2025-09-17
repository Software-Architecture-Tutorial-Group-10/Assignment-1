public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println("\n---Brand A----");

        smartDeviceFactory factoryA = new brandAFactory();
        Bulb bulbA = factoryA.createBulb();
        bulbA.setPowerUsageFromFile("data.txt");
        bulbA.displayInfo();

        Lock lockA = factoryA.createLock();
        lockA.setBatteryUsageFromFile("data.txt");
        lockA.displayInfo();

        System.out.println("\n---Brand B---");

        smartDeviceFactory factoryB = new brandBFactory();
        Bulb bulbB = factoryB.createBulb();
        bulbB.setPowerUsageFromFile("data.txt");
        bulbB.displayInfo();

        Lock lockB = factoryB.createLock();
        lockB.setBatteryUsageFromFile("data.txt");
        lockB.displayInfo();



    }
}
