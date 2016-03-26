package org.paradise.function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 26/03/2016.
 */
public class DecorationTest {

    Decoration decoration;

    @Before
    public void setUp() throws Exception {

        decoration = new Decoration();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTimeSquare() {

        decoration.timeSquare.apply(3);
        decoration.timeSquare.apply(3);
    }

}