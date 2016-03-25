package org.paradise.function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by terrence on 26/03/2016.
 */
public class PredicationTest {

    Predication predication;

    @Before
    public void setUp() throws Exception {

        predication = new Predication();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAffirmative() {

        assertTrue(predication.affirmative.test(1));
    }

    @Test
    public void testNegative() {

        assertFalse(predication.negative.test(1));
    }

    @Test
    public void testIsEven() {

        assertTrue(predication.isEven.test(2));
        assertFalse(predication.isEven.test(3));
    }

    @Test
    public void testIs() {

        assertFalse(predication.is(5, "even"));
        assertTrue(predication.is(5, "odd"));

        assertFalse(predication.is(5, "prime"));
    }

}