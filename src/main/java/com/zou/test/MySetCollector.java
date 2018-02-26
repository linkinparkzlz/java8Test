package com.zou.test;


import org.omg.CORBA.portable.IDLEntity;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collector.Characteristics.UNORDERED;
/*

自定义收集器实现

 */

public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {


    //作用是提供一个空的容器
    @Override
    public Supplier<Set<T>> supplier() {

        System.out.println("supplier  invoked!");

        return HashSet::new;

    }

    //累加器
    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator  invoked!");
        return Set<T>::add;
    }

    //将部分结果合并为一个结果
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    //完成器
    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher  invoked");
        return t -> t;
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics  invoked");
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH, UNORDERED));
    }


    public static void main(String[] args) {


        List<String> list = Arrays.asList("hello", "world", "welcome");

        Set<String> set = list.stream().collect(new MySetCollector<>());

        System.out.println(set);
    }


}














































