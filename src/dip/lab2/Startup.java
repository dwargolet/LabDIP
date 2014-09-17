package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
 
    public static void main(String[] args) {
        
//        TipCalculationManager calc = new TipCalculationManager(new FoodServiceTipCalculator(10.0, ServiceQuality.GOOD));
    
//        TipCalculator calc2 = new BaggageServiceTipCalculator(5, ServiceQuality.GOOD);
        
//        System.out.println(calc.getTip());
    
//        System.out.println(calc2.getTip());
    
    
    ServiceQualityInputKeyboard keyb = new ServiceQualityInputKeyboard();
    
  System.out.print(keyb);
    
    }
    
}
