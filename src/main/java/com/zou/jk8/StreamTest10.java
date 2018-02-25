package com.zou.jk8;

import java.util.Arrays;
import java.util.List;


//
public class StreamTest10 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");
        //将List中长度为5的第一个单词打印出来

        //  list.stream().mapToInt(item -> item.length()).filter(length -> length == 5).findFirst().ifPresent(System.out::println);


        //说明了什么问题.  流是短路的，找到符合条件的之后，后面的就不再执行
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

        /*
        输出结果：

        hello
        5

         */

    }

}





































































