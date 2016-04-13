package org.paradise.function;

import org.junit.Test;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by terrence on 13/04/2016.
 */
public class CurryTest {

    @Test
    public void testCalculationOptional() throws Exception {

        assertEquals("Incorrect result", Optional.of(7), Optional.of(3).map(Curry.calculation(1, 2)));
    }

    @Test
    public void testCalculationStream() throws Exception {

        assertEquals("Incorrect result", Optional.of(7), Stream.of(3).map(Curry.calculation(1, 2)).findAny());
    }

}