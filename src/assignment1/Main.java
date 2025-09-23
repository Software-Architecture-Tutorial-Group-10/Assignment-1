package assignment1;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---Brand A----");

        smartDeviceFactory factoryA = new brandAFactory();
        Bulb bulbA = factoryA.createBulb();
        bulbA.setPowerUsageFromFile("dataFiles/brandA_bulb.txt");
        bulbA.displayInfo();

        Lock lockA = factoryA.createLock();
        lockA.setBatteryUsageFromFile("dataFiles/brandA_lock.txt");
        lockA.displayInfo();

        System.out.println("\n---Brand B---");

        smartDeviceFactory factoryB = new brandBFactory();
        Bulb bulbB = factoryB.createBulb();
        bulbB.setPowerUsageFromFile("dataFiles/brandB_bulb.txt");
        bulbB.displayInfo();

        Lock lockB = factoryB.createLock();
        lockB.setBatteryUsageFromFile("dataFiles/brandB_lock.txt");
        lockB.displayInfo();



    }
}
