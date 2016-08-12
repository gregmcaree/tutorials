package uk.co.gm.funcional.timing;

import java.util.Date;
import java.util.function.Supplier;

public class Timing {

    public static Double timed(String description, Supplier<Double> code) {

        final Date before = new Date();
        Double result = code.get();
        final long duration = new Date().getTime() - before.getTime();
        System.out.println(description +  " took " + duration + " milliseconds");

        return result;
    }
}
