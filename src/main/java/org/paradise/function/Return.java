package org.paradise.function;

import java.util.function.Function;

/**
 * Created by terrence on 26/03/2016.
 */
public class Return {

    static Function<Double, Double> power(double raiseTo) {

        return x -> Math.pow(x, raiseTo);
    }

    static Function<Double, Double> square = power(2.0);

    static Function<Double, Double> cube = power(3.0);

}
