package uk.co.gm.functional;

public class FixedCosts extends PolynomialQuantity {

    public FixedCosts(double constant) {
        super (new double[] {constant});
    }
    @Override
    public String getName() {
        return "Fixed Costs";
    }


}
