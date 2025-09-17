import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class brandALock implements Lock{
    private int batteryUsage;

    @Override
    public void  setBatteryUsageFromFile(String file){
        try {
            Scanner scanner = new Scanner(new File(file));
            if (scanner.hasNextInt()) {
                this.batteryUsage = scanner.nextInt();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
            this.batteryUsage = -1;
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Battery Usage: "+batteryUsage+"%");
    }

}
