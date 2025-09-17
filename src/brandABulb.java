public class brandABulb implements Bulb{
    private int powerUsage;

    @Override
    public void setPowerUsageFromFile(String file){
        this.powerUsage = 60; //temp value will change to read from actual data file
    }

    @Override
    public void displayInfo(){
        System.out.println("Power Usage: "+ powerUsage+"W");
    }

}
