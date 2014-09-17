package dip.lab2;

/**
 *
 * @author dworgolet
 */
public class TipCalculationManager {
    
    private TipCalculator calculateTip;
  

    public TipCalculator getCalculateTip() {
        return calculateTip;
    }

    public void setCalculateTip(TipCalculator calculateTip) {
        this.calculateTip = calculateTip;
    }

    public TipCalculationManager(TipCalculator calculateTip) {
        this.calculateTip = calculateTip;
        
    }
     

    public void processTipCalculation(){
        calculateTip.getTip();
        calculateTip.getServiceQuality();
    }
}
