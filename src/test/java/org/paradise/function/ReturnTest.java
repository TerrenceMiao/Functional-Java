package org.paradise.function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by terrence on 26/03/2016.
 */
public class ReturnTest {

    @BeforeEach
    public void setUp() throws Exception {

    }

    @AfterEach
    public void tearDown() throws Exception {

    }

    @Test
    public void testPower() throws Exception {

        assertEquals(Double.valueOf(4.0), Return.square.apply(2.0), "Incorrect result");

        assertEquals(Double.valueOf(8.0), Return.cube.apply(2.0), "Incorrect result");
    }

}