public class brandBBulb implements Bulb{
    private int powerUsage;

    public void setPowerUsageFromFile(String file){
        this.powerUsage = 60; //temp value will change to read from actual data file
    }

    public void displayInfo(){
        System.out.println("Brand B Bulb, Power Usage: "+ powerUsage+"W");
    }

}
