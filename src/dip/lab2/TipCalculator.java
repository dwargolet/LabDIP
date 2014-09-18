package dip.lab2;

/**
 *
 * @author Daniel
 */
public interface TipCalculator {
    public abstract ServiceQuality getServiceQuality();
    public abstract void setServiceRating(ServiceQuality q);
    public abstract double getTip();

    
    
}
