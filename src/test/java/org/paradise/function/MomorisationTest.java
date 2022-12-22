package org.paradise.function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by terrence on 24/03/2016.
 */
public class MomorisationTest {

    @BeforeEach
    public void setUp() throws Exception {

    }

    @AfterEach
    public void tearDown() throws Exception {

    }

    @Test
    public void testMemorisedDoubler() {

        System.out.println("First call");
        assertEquals(Double.valueOf(4.0), Memorisation.memorisedDoubler.apply(2.0), "Incorrect result");

        System.out.println("Second call");
        assertEquals(Double.valueOf(4.0), Memorisation.memorisedDoubler.apply(2.0), "Incorrect result");

        System.out.println("Third call");
        assertEquals(Double.valueOf(6.0), Memorisation.memorisedDoubler.apply(3.0), "Incorrect result");

        System.out.println("Fourth call");
        assertEquals(Double.valueOf(6.0), Memorisation.memorisedDoubler.apply(3.0), "Incorrect result");
    }

}