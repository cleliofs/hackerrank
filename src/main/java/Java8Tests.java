package main.java;

import java.util.*;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * Created by clelio on 23/06/15.
 */
public class Java8Tests {

    public static void main(String[] args) {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        final List<Integer> res = list.stream().filter(e -> e % 2 == 0).flatMap(e -> Collections.singletonList(e * 2).stream()).collect(Collectors.toList());
        res.forEach(System.out::println);

        final Double res2 = list.stream().distinct().map(Object::toString).collect(Collectors.averagingInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String value) {
                return Integer.parseInt(value);
            }
        }));

        System.out.println(res2);

        final Optional<Integer> reduce = list.stream().reduce((integer, integer2) -> integer + integer2);
        System.out.println(reduce.orElseGet(() -> -1));

        final Optional<Integer> max = list.stream().max(Integer::compareTo);

        System.out.println(max.orElseGet(() -> -1));
    }

}
