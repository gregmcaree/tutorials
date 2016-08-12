package uk.co.gm.functional.profit;

public interface QuantityOfInterest {

    String getName();
    /**
     * expected value for a particular month
     * @param time, month 1-12
     * @return
     */
    double valueAt(final int time);
}
