package dip.lab2;

/**
 *
 * @author dworgolet
 */
public class TipCalculationManager {
    
    private TipOutput calculateTip;
    private ServiceQualityInput stateTheQualityOfService;
    
    

    public TipOutput getCalculateTip() {
        return calculateTip;
    }

    public void setCalculateTip(TipOutput calculateTip) {
        this.calculateTip = calculateTip;
    }

    public ServiceQualityInput getStateTheQualityOfService() {
        return stateTheQualityOfService;
    }

    public void setStateTheQualityOfService(ServiceQualityInput stateTheQualityOfService) {
        this.stateTheQualityOfService = stateTheQualityOfService;
    }


    
    public void calculateTotalTip(){
        calculateTip.outPutTip(tip);
        ServiceQualityInput.
    }
    
    
    
    
//    public final void calculateTotalTip(){
//        calculateTip.outPutTip(TipCalculator.getTip());
//        stateTheQualityOfService.getServiceQuality();
//    }
//            

    public TipCalculationManager(TipOutput calculateTip, ServiceQualityInput stateTheQualityOfService) {
        this.calculateTip = calculateTip;
        this.stateTheQualityOfService = stateTheQualityOfService;
    }
            
            
}
