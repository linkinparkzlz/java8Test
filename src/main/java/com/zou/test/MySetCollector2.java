package com.zou.test;

/*

将Set集合进行收集，将结果封装到一个Map当中

输入： Set<String>
输出： Map<String,String>

示例输入： ["hello","world","hello world"]
示例输出： [{hello,hello},{world,world},{hello world,hello world}]

 */

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>> {

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier  invoked!");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator  invoked!");

        return (set, item) -> {
            //当使用并行流时，可以看看有多少个线程
            // System.out.println("accumulator :" + Thread.currentThread().getName());
            set.add(item);//将下一个元素累积到中间结果容器中
        };
    }

    //只有在并行流的时候才会被调用
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner  invoked!");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher  invoked!");

        return set -> {
            Map<T, T> map = new HashMap<>();
            set.stream().forEach(item -> map.put(item, item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics  invoked!");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "welcome", "hello world");
        Set<String> set = new HashSet<>();

        set.addAll(list);

        System.out.println("set :" + set);

        //串行流
        Map<String, String> map = set.stream().collect(new MySetCollector2<>());
        System.out.println(map);

        //并行流
        Map<String, String> map1 = set.parallelStream().collect(new MySetCollector2<>());
        System.out.println(map1);
    }
}

























































































