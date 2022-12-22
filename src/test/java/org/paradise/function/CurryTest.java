package org.paradise.function;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by terrence on 13/04/2016.
 */
public class CurryTest {

    @Test
    public void testCalculationOptional() throws Exception {

        assertEquals(Optional.of(7), Optional.of(3).map(Curry.calculation(1, 2)), "Incorrect result");
    }

    @Test
    public void testCalculationStream() throws Exception {

        assertEquals(Optional.of(7), Stream.of(3).map(Curry.calculation(1, 2)).findAny(), "Incorrect result");

        assertArrayEquals(Arrays.asList(7, 9, 11).stream().toArray(Integer[]::new),
                Stream.of(3, 4, 5).map(Curry.calculation(1, 2)).toArray(), "Incorrect result");
    }

}