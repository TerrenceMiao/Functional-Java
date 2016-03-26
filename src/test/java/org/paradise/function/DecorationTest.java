package org.paradise.function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 26/03/2016.
 */
public class DecorationTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTimeSquare() {

        Decoration.timeSquare.apply(3);
        Decoration.timeSquare.apply(4);
        Decoration.timeSquare.apply(3);
        Decoration.timeSquare.apply(4);
    }

}