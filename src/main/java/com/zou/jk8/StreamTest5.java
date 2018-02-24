package com.zou.jk8;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {


    public static void main(String[] args) {

        Stream<String> stream = Stream.of("hello", "world", "hello world");

        //转换为List
        List<String> list = stream.collect(Collectors.toList());

        list.forEach(System.out::println);


        //转换为Set
        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));

        set.forEach(System.out::println);


        //joining()
        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);


    }


}






















































