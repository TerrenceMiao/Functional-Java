package org.paradise.stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by terrence on 28/03/2016.
 */
public class ParallelTest {

    List<Double> numbers;

    @BeforeEach
    public void setUp() throws Exception {

        numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
    }

    @AfterEach
    public void tearDown() throws Exception {

    }

    @Test
    public void testTimerExpensiveSquare() throws Exception {

        System.out.print("Run in sequential ");
        Parallel.timerExpensiveSquare(numbers.stream());

        System.out.print("Run in parallel ");
        Parallel.timerExpensiveSquare(numbers.parallelStream());
    }

}