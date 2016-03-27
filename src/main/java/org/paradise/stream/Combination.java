package org.paradise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by terrence on 28/03/2016.
 */
public class Combination {

    static List<List<?>> combinations(List<?> oneList, List<?> twoList) {

        return oneList.stream()
                .flatMap(one ->
                        twoList.stream()
                                .map(two ->
                                        Arrays.asList(one, two)))
                .collect(Collectors.toList());
    }

}
