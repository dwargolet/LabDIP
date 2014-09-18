package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;

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
 * @Daniel Wargolet
 */
public class Startup {
 
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        TipCalculationManager calc = new TipCalculationManager(new FoodServiceTipCalculator(12.50, ServiceQuality.GOOD));
        System.out.println("You should leave a tip of " + nf.format(calc.getTip()));
    
        TipCalculationManager calc2 = new TipCalculationManager(new BaggageServiceTipCalculator(6, ServiceQuality.FAIR));
        System.out.println("You should leave a tip of " + nf.format(calc2.getTip()));
    
    

    }
    
}
