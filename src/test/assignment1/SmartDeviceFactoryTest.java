package test.assignment1;

import assignment1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartDeviceFactoryTest {

    @Test
    void testBrandABulbFromFile() {
        Bulb bulb = new brandABulb();
        bulb.setPowerUsageFromFile("dataFiles/brandA_bulb.txt");

        Assertions.assertEquals(65, ((brandABulb) bulb).getPowerUsage());
    }

    @Test
    void testBrandALockFromFile() {
        Lock lock = new brandALock();
        lock.setBatteryUsageFromFile("dataFiles/brandA_lock.txt");

        Assertions.assertEquals(73, ((brandALock) lock).getBatteryUsage());
    }

    @Test
    void testBrandBBulbFromFile() {
        Bulb bulb = new brandBBulb();
        bulb.setPowerUsageFromFile("dataFiles/brandB_bulb.txt");

        Assertions.assertEquals(60, ((brandBBulb) bulb).getPowerUsage());
    }

    @Test
    void testBrandBLockFromFile() {
        Lock lock = new brandBLock();
        lock.setBatteryUsageFromFile("dataFiles/brandB_lock.txt");

        Assertions.assertEquals(81, ((brandBLock) lock).getBatteryUsage());
    }


}
