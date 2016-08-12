package uk.co.gm.traditional.profit;

public class Sales extends MonthByMonthQuantity {

    public Sales(final double[] values) {
        super(values);
    }

    @Override
    public String getName() {
        return "Expected Sales";
    }
}
