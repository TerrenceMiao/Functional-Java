package org.paradise.function;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 23/04/2016.
 */
public class DefaultImplTest {

    DefaultImpl defaultImpl = new DefaultImpl();

    @Test
    public void testFoo() throws Exception {

        assertEquals("Incorrect Foo", "Foo", defaultImpl.foo());
    }

    @Test
    public void testBar() throws Exception {

        assertEquals("Incorrect Bar", "Bar", defaultImpl.bar());
    }

}