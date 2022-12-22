package org.paradise.function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by terrence on 26/03/2016.
 */
public class TimerTest {

    @BeforeEach
    public void setUp() throws Exception {

    }

    @AfterEach
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