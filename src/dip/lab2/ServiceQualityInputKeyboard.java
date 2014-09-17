package dip.lab2;

import java.util.Scanner;

/**
 *
 * @author dworgolet
 */
public class ServiceQualityInputKeyboard implements ServiceQualityInput {
    Scanner keyboard = new Scanner(System.in);
        
    private String quality;
    
    public enum ServiceQuality {
    GOOD, FAIR, POOR
}

    @Override
    public String serviceQuality(Enum ServiceQuality){
        System.out.println("Please enter the quality of service: ");
        quality = keyboard.nextLine();
        return quality;
    }

    
    

}
