package org.paradise.function;

import java.util.function.Function;

/**
 * Created by terrence on 26/03/2016.
 */
public class Return {

    Function<Double, Double> power(double raiseTo) {

        return x -> Math.pow(x, raiseTo);
    }

    Function<Double, Double> square = power(2.0);

    Function<Double, Double> cube = power(3.0);

}
