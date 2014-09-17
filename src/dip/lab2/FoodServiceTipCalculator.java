package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{

    private double bill;
    private ServiceQuality serviceQuality;
    private static double minBill = 0.00;
    public final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + minBill;
    
    public FoodServiceTipCalculator(double bill, ServiceQuality serviceQuality) {
        this.bill = bill;
        this.serviceQuality = serviceQuality;
    }

    
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }
        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    @Override
    public ServiceQuality getServiceQuality(){
        return serviceQuality;
    }
    
    @Override
    public void setServiceRating(ServiceQuality q){
        serviceQuality = q;
    }
    
}
