package org.paradise.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        assertArrayEquals("Incorrect result", Arrays.asList(7, 9, 11).stream().toArray(Integer[]::new),
                Stream.of(3, 4, 5).map(Curry.calculation(1, 2)).toArray());
    }

}