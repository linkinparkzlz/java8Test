package com.zou.jk8;

@FunctionalInterface
public interface MyInterface {

    //只有一个抽象方法
    void test();

    //为什么再加一个也可以呢，是因为toString()是Object类的方法.
    String toString();
}


/*

 If
 * an interface declares an abstract method overriding one of the
 * public methods of {@code java.lang.Object}, that also does
 * <em>not</em> count toward the interface's abstract method count
 * since any implementation of the interface will have an
 * implementation from {@code java.lang.Object} or elsewhere.



 */