package com.zou.jk8;

import java.util.Arrays;
import java.util.List;

/*
方法引用可以看做是Lambda的语法糖

我们可以将方法引用看做是一个函数指针

方法引用贡分为4类：
1.  类名 :: 静态方法
2.



 */
public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "welcome");
        list.forEach(item -> System.out.println(item));

        list.forEach(System.out::println);//方法引用


    }
}
