package org.paradise.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListsTest {

    @Test
    public void convertListOfListIntoList() {

        List<String> numbers = Arrays.asList("1", "2");
        List<String> letters = Arrays.asList("A", "B");

        List<List<String>> listOfList = Arrays.asList(numbers, letters);

        Lists lists = new Lists();
        List<String> aList = lists.convertListOfListIntoList(listOfList);

        assertEquals(aList, Arrays.asList( "1", "2", "A", "B"), "Incorrect result");
    }

}