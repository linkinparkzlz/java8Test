package com.zou.jk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello welcome", "hello world", "hello  world  hello", "hello welcome");

        //去重  为什么不对呢
        //  list.stream().map(item -> item.split(" ")).distinct().collect(Collectors.toList()).forEach(System.out :: println);
        /*
        输出：
        [Ljava.lang.String;@4e50df2e
        [Ljava.lang.String;@1d81eb93
        [Ljava.lang.String;@7291c18f
        [Ljava.lang.String;@34a245ab
         */

        //使用flatMap
        List<String> list1 = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        list1.forEach(System.out::println);


    }


}






































