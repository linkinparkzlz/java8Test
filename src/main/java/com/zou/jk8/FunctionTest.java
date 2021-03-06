package com.zou.jk8;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(1, value -> {
            return 2 * value;
        }));

        System.out.println(test.compute(2, value -> 5 + value));

        System.out.println(test.compute(3, value -> value * value));

        System.out.println(test.convert(5, value -> String.valueOf(value + "hello")));


    }


    //高阶函数，接受一个函数作为参数
    public int compute(int a, Function<Integer, Integer> function) {


        int result = function.apply(a);

        return result;
    }


    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
/*

如果一个函数接受一个函数作为参数，或者返回一个函数作为返回值，那么该函数就叫做高阶函数

 */