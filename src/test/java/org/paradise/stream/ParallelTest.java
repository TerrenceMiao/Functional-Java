package org.paradise.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by terrence on 28/03/2016.
 */
public class ParallelTest {

    List<Double> numbers;

    @Before
    public void setUp() throws Exception {

        numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
    }

    @After
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