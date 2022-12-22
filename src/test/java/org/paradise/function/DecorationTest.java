package org.paradise.function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by terrence on 26/03/2016.
 */
public class DecorationTest {

    @BeforeEach
    public void setUp() throws Exception {

    }

    @AfterEach
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