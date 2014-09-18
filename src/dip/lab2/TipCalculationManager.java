package dip.lab2;

/**
 *
 * @author dworgolet
 */
public class TipCalculationManager {
    
    private final TipCalculator calculateTip;
  

    public TipCalculationManager(TipCalculator calculateTip) {
        this.calculateTip = calculateTip;
        
    }
     

    public double getTip(){
        return calculateTip.getTip();
    } 

}
