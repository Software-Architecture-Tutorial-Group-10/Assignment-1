public class brandALock implements Lock{
    private int batteryUsage;

    @Override
    public void  setBatteryUsageFromFile(String file){
        this.batteryUsage = 73; // Will get from file later
    }

    @Override
    public void displayInfo(){
        System.out.println("Battery Usage: "+batteryUsage+"%");
    }

}
