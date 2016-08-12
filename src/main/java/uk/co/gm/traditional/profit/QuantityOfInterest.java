package uk.co.gm.traditional.profit;

public interface QuantityOfInterest {

    String getName();
    /**
     * expected value for a particular month
     * @param time, month 1-12
     * @return
     */
    double valueAt(final int time);
}
