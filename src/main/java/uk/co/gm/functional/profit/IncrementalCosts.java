package uk.co.gm.functional.profit;

public class IncrementalCosts implements QuantityOfInterest {

    private final FunctionOverTime valueFunction;

    public IncrementalCosts(FunctionOverTime valueFunction) { this.valueFunction = valueFunction; }

    @Override
    public String getName() {
        return "Incremental Costs";
    }

    public double valueAt(int time) { return valueFunction.valueAt(time); }
}
