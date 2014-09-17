package dip.lab2;

/**
 *
 * @author Daniel
 */
public interface TipCalculator {
    public abstract ServiceQuality getServiceQuality();
    public abstract void setServiceRating(ServiceQuality q);
    public abstract double getTip();
//    public abstract void informTipTotal();

    
    public final double GOOD_RATE = 0.20;
    public final double FAIR_RATE = 0.15;
    public final double POOR_RATE = 0.10;
}
