package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class brandABulb implements Bulb {
    private int powerUsage;

    @Override
    public void setPowerUsageFromFile(String file){
        try {
            Scanner scanner = new Scanner(new File(file));
            if (scanner.hasNextInt()) {
                this.powerUsage = scanner.nextInt();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
            this.powerUsage = -1;
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Power Usage: "+ powerUsage+"W");
    }

    public int getPowerUsage() {
        return powerUsage;
    }


}
