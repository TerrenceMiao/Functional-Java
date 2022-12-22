package org.paradise.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorting {

    public static List<String> sortSet(Set<String> set) {

        return set.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
    
}
