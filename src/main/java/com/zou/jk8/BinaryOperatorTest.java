package com.zou.jk8;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {

        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();

        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> (a + b)));

        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> (a - b)));

        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> (a * b)));

        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> (a / b)));

        System.out.println(binaryOperatorTest.getShort("hello123", "world", (a, b) -> a.length() - b.length()));


    }

    //BinaryOperator  接受两个参数，返回一个结果
    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {

        return binaryOperator.apply(a, b);
    }


    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }


}
















































































