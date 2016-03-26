package org.paradise.function;

import java.util.function.Function;

/**
 * Created by terrence on 26/03/2016.
 */
public class Decoration {

    static Function<Integer, Integer> expensiveSquare = x -> {

        System.out.println("Now Squaring...");

        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        return x * x;
    };

    // Decorate with time and memoize
    static Function<Integer, Integer> timeSquare = Timer.time(Memorisation.memorise(expensiveSquare));

}
