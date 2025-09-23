package assignment1;

public class brandBFactory implements smartDeviceFactory {

    @Override
    public Bulb createBulb(){
        return new brandBBulb();
    }

    @Override
    public Lock createLock(){
        return new brandBLock();
    }
}
