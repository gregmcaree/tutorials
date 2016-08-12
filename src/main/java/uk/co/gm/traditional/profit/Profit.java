package uk.co.gm.traditional.profit;

public class Profit implements QuantityOfInterest {

    private final Sales sales;
    private final IncrementalCosts incrementalCosts;
    private final FixedCosts fixedCosts;

    public Profit (final Sales sales, IncrementalCosts incrementalCosts, FixedCosts fixedCosts) {
        this.sales = sales;
        this.incrementalCosts = incrementalCosts;
        this.fixedCosts = fixedCosts;
    };


    @Override
    public String getName() {
        return "Profit!!";
    }

    @Override
    public double valueAt(final int time) {
        return sales.valueAt(time) - (incrementalCosts.valueAt(time) + fixedCosts.valueAt(time));
    }
}
