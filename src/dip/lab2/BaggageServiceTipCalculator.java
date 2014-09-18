package dip.lab2;


import javax.swing.JOptionPane;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {

    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;
    private final String errorMsg = "Error: Input must be equal to or greater than 0";

    
    
    public BaggageServiceTipCalculator(int bags, ServiceQuality q) {
        this.setBagCount(bags);
        this.setServiceRating(q); // perform validation
        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }
        return tip;
    }
    
    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }
    
    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        if(bagCount < 0) {
            JOptionPane.showMessageDialog(null, "cant be 0");
            
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            JOptionPane.showMessageDialog(null, errorMsg);
            System.exit(0);        
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    

}
