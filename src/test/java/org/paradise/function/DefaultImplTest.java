package org.paradise.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by terrence on 23/04/2016.
 */
public class DefaultImplTest {

    DefaultImpl defaultImpl = new DefaultImpl();

    @Test
    public void testFoo() throws Exception {

        assertEquals("Foo", defaultImpl.foo(), "Incorrect result");
    }

    @Test
    public void testBar() throws Exception {

        assertEquals("Bar", defaultImpl.bar(), "Incorrect result");
    }

}