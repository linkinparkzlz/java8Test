package com.zou.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamTest17 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().forEach(System.out::println);
    }
}


/*

  * The default implementation creates a sequential {@code Stream} from the
     * collection's {@code Spliterator}.
     *
     * @return a sequential {@code Stream} over the elements in this collection
     * @since 1.8
    default Stream<E> stream() {
     return StreamSupport.stream(spliterator(), false);
}

 */






































