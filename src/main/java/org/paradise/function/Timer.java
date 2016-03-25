package org.paradise.function;

import java.math.BigInteger;
import java.util.Random;
import java.util.function.Function;

/**
 * Created by terrence on 26/03/2016.
 */
public class Timer {

    public Function<Integer, BigInteger> getPrime = x -> new BigInteger(x, new Random()).nextProbablePrime();

    public <T, R> Function<T, R> time(Function<T, R> fn) {

        return t -> {
            long startTime = System.currentTimeMillis();
            R result = fn.apply(t);
            long timeTaken = System.currentTimeMillis() - startTime;
            System.out.println("Time: " + timeTaken + " ms");
            return result;
        };
    }

}
