package org.paradise.function;

import java.util.List;
import java.util.stream.Collectors;

public class Lists<T> {

    public List<T> convertListOfListIntoList(List<List<T>> listOfList) {

        List aList = listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        return aList;
    }

}
