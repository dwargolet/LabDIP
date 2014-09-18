package dip.lab2;

/**
 *
 * @author dworgolet
 */
public class TipCalculationManager {
    
    private TipCalculator calculateTip;
  

     public TipCalculationManager(TipCalculator calculateTip) {
        this.calculateTip = calculateTip;
        
    }
     
    public TipCalculator getCalculateTip() {
        return calculateTip;
    }

    public void setCalculateTip(TipCalculator calculateTip) {
        this.calculateTip = calculateTip;
    }

   
    public double getTip(){
        return calculateTip.getTip();
    } 

    public void displayTipCalculation(){
        System.out.println("You should leave a tip of $" + 
                calculateTip.getTip());
        
    }
}
