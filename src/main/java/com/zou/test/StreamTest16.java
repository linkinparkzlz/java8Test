package com.zou.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest16 {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//
//        list.stream().onClose(() -> {
//
//            System.out.println("aaa");
//        }).onClose(() -> {
//            System.out.println("bbb");
//        }).forEach(System.out::println);

        /*
        输出，说明关闭处理器未执行
        hello
        world
        hello world
         */


        try (Stream<String> stream = list.stream()) {

            stream.onClose(() -> {

                System.out.println("aaa");
            }).onClose(() -> {
                System.out.println("bbb");
            }).forEach(System.out::println);

        }

        //输出  ，说明关闭处理器执行了
        /*
        hello
        world
        hello world
        aaa
        bbb
         */
    }

}










































