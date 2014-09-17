package dip.lab2;

/**
 *
 * @author dworgolet
 */
public class TipCalculationManager {
    
    private TipCalculator calculateTip;
    private TipCalculator stateTheQualityOfService;

    
    public TipCalculationManager(TipCalculator calculateTip, TipCalculator stateTheQualityOfService) {
        this.calculateTip = calculateTip;
        this.stateTheQualityOfService = stateTheQualityOfService;
    }

    public TipCalculator getCalculateTip() {
        return calculateTip;
    }

    public void setCalculateTip(TipCalculator calculateTip) {
        this.calculateTip = calculateTip;
    }

    public TipCalculator getStateTheQualityOfService() {
        return stateTheQualityOfService;
    }

    public void setStateTheQualityOfService(TipCalculator stateTheQualityOfService) {
        this.stateTheQualityOfService = stateTheQualityOfService;
    }
    
    public void calculateTotalTip(){
        calculateTip.getTip();
        stateTheQualityOfService.getServiceQuality();
    }
            
            
            
}
