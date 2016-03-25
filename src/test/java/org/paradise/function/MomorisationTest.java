package org.paradise.function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 24/03/2016.
 */
public class MomorisationTest {

    Memorisation memorisation = new Memorisation();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMemorisedDoubler() {

        System.out.println("First call");
        assertEquals("Incorrect memorised double return", Double.valueOf(4.0), memorisation.memorisedDoubler.apply(2.0));

        System.out.println("Second call");
        assertEquals("Incorrect memorised double return", Double.valueOf(4.0), memorisation.memorisedDoubler.apply(2.0));
    }

}