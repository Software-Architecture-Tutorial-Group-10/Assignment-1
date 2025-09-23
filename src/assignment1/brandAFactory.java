package assignment1;

public class brandAFactory implements smartDeviceFactory {

    @Override
    public Bulb createBulb(){
        return new brandABulb();
    }

    @Override
    public Lock createLock(){
        return new brandALock();
    }


}
