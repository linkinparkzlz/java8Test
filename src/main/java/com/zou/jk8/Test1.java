package com.zou.jk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {


    public static void main(String[] args) {

        List<Integer>  list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //早期集合的遍历
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }

        System.out.println("*****************");
        //增强的for循环
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("*****************");
        //Java8的遍历
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("*****************");

        list.forEach(integer -> System.out.println(integer) );

    }
}

/*

函数式接口：

1.如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口
2.如果我们在某个接口上声明了FunctionalInterface注解，那么编译器就会按照函数式接口的定义来要求该接口。
3.如果一个接口只有一个抽象方法，但我们并没有给该接口声明FunctionalInterface注解，那么编译器依旧会将该接口看做是函数式接口。
 */


/*

默认方法：在接口里面的方法可以有实现。

forEach： 底层还是使用增强的for循环来实现的
 default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }

 */