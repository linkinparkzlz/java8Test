package com.zou.jk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {

        //创建流
        Stream stream1 = Stream.of("hello", "world", "welcome");


        String[] myArray = new String[]{"hello", "world", "welcome"};
        Stream stream2 = Stream.of(myArray);

        Stream stream3 = Arrays.stream(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream stream4 = list.stream();


    }


}











































