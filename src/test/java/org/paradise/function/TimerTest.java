package org.paradise.function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 26/03/2016.
 */
public class TimerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTime() throws Exception {

        Timer.time(Timer.getPrime).apply(10);
        Timer.time(Timer.getPrime).apply(100);
        Timer.time(Timer.getPrime).apply(1000);
        Timer.time(Timer.getPrime).apply(2000);
    }

}