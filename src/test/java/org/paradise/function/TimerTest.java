package org.paradise.function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 26/03/2016.
 */
public class TimerTest {

    Timer timer;

    @Before
    public void setUp() throws Exception {

        timer = new Timer();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTime() throws Exception {

        timer.time(timer.getPrime).apply(1000);
    }

}