package org.paradise.function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 26/03/2016.
 */
public class ReturnTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPower() throws Exception {

        assertEquals("Incorrect square return", Double.valueOf(4.0), Return.square.apply(2.0));

        assertEquals("Incorrect cube return", Double.valueOf(8.0), Return.cube.apply(2.0));
    }

}