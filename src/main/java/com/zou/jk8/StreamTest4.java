package com.zou.jk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {


    public static void main(String[] args) {

        Stream<String> stream = Stream.of("hello", "world", "hello  world");

        //  String[] stringArray = stream.toArray(length -> new String[length]);

        String[] stringArray = stream.toArray(String[]::new);

        Arrays.asList(stringArray).forEach(System.out::println);

        Stream<String> stream1 = Stream.of("hello", "world", "hello world");

        List<String> list = stream.collect(Collectors.toList());
        Collectors.toList();

        list.forEach(System.out::println);


        //   List<String> list1 = stream1.collect(() -> new ArrayList(), (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));


        //方法引用
        List<String> list1 = stream1.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);


        list1.forEach(System.out::println);


    }
}
























