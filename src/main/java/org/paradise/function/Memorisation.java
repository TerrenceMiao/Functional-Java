package org.paradise.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by terrence on 24/03/2016.
 */
public class Memorisation {

    public <T, R> Function<T, R> memorise(Function<T, R> fn) {

        System.out.println("Init memorise ...\n");

        final Map<T, R> cache = new HashMap<>();

        return t -> {
            if (!cache.containsKey(t)) {
                R r = fn.apply(t);
                cache.put(t, r);
                return r;
            }

            return cache.get(t);
        };
    }

    public Function<Double, Double> memorisedDoubler = memorise(x -> {

        System.out.println("In memorisedDoubler(" + x + ") ...\n");

        return x * 2;
    });

}
