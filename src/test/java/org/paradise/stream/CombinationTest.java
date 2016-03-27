package org.paradise.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by terrence on 28/03/2016.
 */
public class CombinationTest {

    List<Character> alphabets;
    List<Integer> numbers;

    @Before
    public void setUp() throws Exception {

        alphabets = Arrays.asList('a', 'b', 'c');
        numbers = Arrays.asList(1, 2, 3);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCombinations() throws Exception {

        List<List<?>> combo = Combination.combinations(alphabets, numbers);

        System.out.println(combo);
    }

}