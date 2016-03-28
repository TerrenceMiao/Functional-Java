package org.paradise.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by terrence on 28/03/2016.
 */
public class Parallel {

    private static Double expensiveSquare(Double n) {

        try {
            Thread.sleep(500);
            return n * n;
        } catch (InterruptedException ie) {
            return Double.NaN;
        }
    }

    public static List<Double> timerExpensiveSquare(Stream<Double> numbers) {

        long startTime = System.currentTimeMillis();
        List<Double> squares = numbers.map(n -> expensiveSquare(n)).collect(Collectors.toList());
        long timeTaken = System.currentTimeMillis() - startTime;

        System.out.println("time: " + timeTaken + " ms");

        return squares;
    }

}
