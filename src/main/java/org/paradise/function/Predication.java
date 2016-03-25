package org.paradise.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by terrence on 26/03/2016.
 */
public class Predication<T> {

    Predicate<T> affirmative = x -> true;

    Predicate<T> negative = x -> false;

    Predicate<Integer> falsify = x -> false;

    Predicate<Integer> isEven = x -> x % 2 == 0;

    Boolean is(final Integer n, String operate) {

        Map<String, Predicate<Integer>> predicateMap = new HashMap<>();

        predicateMap.put("even", isEven);
        predicateMap.put("odd", isEven.negate());

        return predicateMap.getOrDefault(operate, falsify).test(n);
    }

}
