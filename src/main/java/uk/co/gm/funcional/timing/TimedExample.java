package uk.co.gm.funcional.timing;


import static uk.co.gm.funcional.timing.Timing.timed;

public class TimedExample {
    public static void main(final String[] args) {

        final Double costs = timed("Cost calculation", (TimedExample::calculateCosts));

        final Double revenue = timed("Revenue calculation", TimedExample::calculateRevenue);

        final Double profit = timed("Profit calculation",
                () -> calculateProfit(costs, revenue));

        System.out.println("Profit is: $" + profit);
    }

    private static Double calculateProfit(Double costs, Double revenue) {
        return 3.0;
    }

    private static Double calculateRevenue() {
        return 5.0;
    }

    private static Double calculateCosts() { return 2.0; }
}
