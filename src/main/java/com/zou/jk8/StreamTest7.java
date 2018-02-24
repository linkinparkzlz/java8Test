package com.zou.jk8;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest7 {

    public static void main(String[] args) {

        //generate()方法
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        System.out.println(stream.findFirst().get());
        stream.findFirst().ifPresent(System.out::println);

        //iterate()方法
        Stream<Integer> stream1 = Stream.iterate(1, item -> item + 2).limit(6);

        System.out.println(stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());


        IntSummaryStatistics summaryStatistics = stream1.filter(item -> item > 200).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getAverage());


        //下面代码会抛出异常  stream has already been operated upon or closed
        //流只能使用一次。
        System.out.println(stream1);
        System.out.println(stream1.filter(item -> item > 2));
        System.out.println(stream1.distinct());


    }

}


































