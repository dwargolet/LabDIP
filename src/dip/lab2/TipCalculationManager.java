package dip.lab2;

/**
 *
 * @author dworgolet
 */
public class TipCalculationManager {
    private ServiceQualityInput qualityInput;
    private TipOutput tipOutput;

    public TipCalculationManager(ServiceQualityInput qualityInput, TipOutput tipOutput) {
        this.qualityInput = qualityInput;
        this.tipOutput = tipOutput;
    }
 
    
    public ServiceQualityInput getQualityInput() {
        return qualityInput;
    }

    public void setQualityInput(ServiceQualityInput qualityInput) {
        this.qualityInput = qualityInput;
    }

    public TipOutput getTipOutput() {
        return tipOutput;
    }

    public void setTipOutput(TipOutput tipOutput) {
        this.tipOutput = tipOutput;
    }
    
//    public void calculateTip(ServiceQualityInput qualityInput, TipOutput tipOutput){
//        qualityInput.
//        tipOutput.
//    }
//    
    
}
