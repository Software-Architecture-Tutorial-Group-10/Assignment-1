public class brandBLock implements Lock{

    private int batteryUsage;

    @Override
    public void  setBatteryUsageFromFile(){
        this.batteryUsage = 73; // Will get from file later
    }

    @Override
    public void displayInfo(){
        System.out.println("Brand Lock B battery usage: "+batteryUsage+"%");
    }


}
