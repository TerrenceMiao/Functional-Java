package org.paradise.stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by terrence on 28/03/2016.
 */
public class CombinationTest {

    List<Character> alphabets;
    List<Integer> numbers;

    @BeforeEach
    public void setUp() throws Exception {

        alphabets = Arrays.asList('a', 'b', 'c');
        numbers = Arrays.asList(1, 2, 3);
    }

    @AfterEach
    public void tearDown() throws Exception {

    }

    @Test
    public void testCombinations() throws Exception {

        List<List<?>> combo = Combination.combinations(alphabets, numbers);

        System.out.println(combo);
    }

}