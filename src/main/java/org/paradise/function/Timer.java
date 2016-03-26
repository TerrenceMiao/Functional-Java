package org.paradise.function;

import java.math.BigInteger;
import java.util.Random;
import java.util.function.Function;

/**
 * Created by terrence on 26/03/2016.
 */
public class Timer {

    static Function<Integer, BigInteger> getPrime = x -> {

        System.out.println("Maximum bitLength for random number: " + x + "");

        return new BigInteger(x, new Random()).nextProbablePrime();
    };

    static <T, R> Function<T, R> time(Function<T, R> fn) {

        return t -> {
            long startTime = System.currentTimeMillis();
            R result = fn.apply(t);
            long timeTaken = System.currentTimeMillis() - startTime;

            System.out.println("Total time taken: " + timeTaken + " ms\n");

            return result;
        };
    }

}
