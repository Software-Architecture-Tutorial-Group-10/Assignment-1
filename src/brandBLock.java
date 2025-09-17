public class brandBLock implements Lock{

    private int batteryUsage;

    @Override
    public void  setBatteryUsageFromFile(String file){
        this.batteryUsage = 81; // Will get from file later
    }

    @Override
    public void displayInfo(){
        System.out.println("Battery Usage: "+batteryUsage+"%");
    }


}
