package org.paradise.function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by terrence on 26/03/2016.
 */
public class PredicationTest {

    Predication predication;

    @BeforeEach
    public void setUp() throws Exception {

        predication = new Predication();
    }

    @AfterEach
    public void tearDown() throws Exception {

    }

    @Test
    public void testAffirmative() {

        assertTrue(predication.affirmative.test(1), "Incorrect result");
    }

    @Test
    public void testNegative() {

        assertFalse(predication.negative.test(1), "Incorrect result");
    }

    @Test
    public void testIsEven() {

        assertTrue(predication.isEven.test(2), "Incorrect result");
        assertFalse(predication.isEven.test(3), "Incorrect result");
    }

    @Test
    public void testIs() {

        assertFalse(predication.is(5, "even"), "Incorrect result");
        assertTrue(predication.is(5, "odd"), "Incorrect result");

        assertFalse(predication.is(5, "prime"), "Incorrect result");
    }

}