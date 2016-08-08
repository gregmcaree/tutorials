package uk.co.gm.functional;

public class Sales extends MonthByMonthQuantity {

    public Sales(final double[] values) {
        super(values);
    }

    @Override
    public String getName() {
        return "Expected Sales";
    }
}
