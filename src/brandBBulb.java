public class brandBBulb implements Bulb{
    private int powerUsage;

    public void setPowerUsageFromFile(String file){
        this.powerUsage = 65; //temp value will change to read from actual data file
    }

    public void displayInfo(){
        System.out.println("Power Usage: "+ powerUsage+"W");
    }

}
