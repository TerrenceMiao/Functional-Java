package org.paradise.stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class SortingTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sortSet() {

        Set<String> set = Set.of("Banana", "Orange", "Mango", "Apple");
        List<String> list = List.of("Apple", "Banana", "Mango", "Orange");

        // Expect [Apple, Banana, Mango, Orange]. TreeSet will get a sorted Set.
        assertLinesMatch(list, Sorting.sortSet(new HashSet(set)), "Expect " + new TreeSet<>(set));
    }

}