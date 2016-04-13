package org.paradise.function;

import java.util.function.Function;

/**
 * Created by terrence on 13/04/2016.
 */
public class Curry {

    static Function<Integer, Function<Integer, Function<Integer, Integer>>> calculation = x -> y -> z -> x + y * z;

    static Function<Integer, Integer> calculation(Integer x, Integer y) {
        return calculation.apply(x).apply(y);
    }

}
