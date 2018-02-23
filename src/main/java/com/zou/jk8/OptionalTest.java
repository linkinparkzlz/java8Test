package com.zou.jk8;

import java.util.Optional;

public class OptionalTest {


    public static void main(String[] args) {

        Optional<String> optional = Optional.of("hello");

        Optional<String> optional1 = Optional.ofNullable("hello");

        //不推荐
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }


        //使用函数式的编程风格
        optional.ifPresent(item -> System.out.println(item));


        System.out.println(optional.orElse("world"));

        System.out.println(optional.orElseGet(() -> "welcome"));

    }
}





























