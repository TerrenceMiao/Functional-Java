package org.paradise.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ListsTest {

    @Test
    public void convertListOfListIntoList() {

        List<String> numbers = Arrays.asList("1", "2");
        List<String> letters = Arrays.asList("A", "B");

        List<List<String>> listOfList = Arrays.asList(numbers, letters);

        Lists lists = new Lists();
        List<String> aList = lists.convertListOfListIntoList(listOfList);

        assertEquals("Incorrect result", aList, Arrays.asList( "1", "2", "A", "B"));
    }

}