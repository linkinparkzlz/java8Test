package com.zou.jk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest6 {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world", "test");

        //将集合中每个元素转换为大写字母

        list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);//方法引用


        //将集合中每个数变为平方
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list1.stream().map(i -> i * i).collect(Collectors.toList()).forEach(System.out::println);

        //flatMap()
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(5, 6, 7));
        //以整体的形式输出
        stream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);


    }


}



















































