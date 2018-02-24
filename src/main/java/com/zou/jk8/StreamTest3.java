package com.zou.jk8;

import java.util.Arrays;
import java.util.List;


/*
流由三部分组成：
1.源
2.零个或多个中间操作
3.终止操作


流操作的分类：
1.惰性求值
2.及早求值

 */

public class StreamTest3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(list.stream().map(i -> 2 * i).reduce(0, Integer::sum));


    }

}


/*

Collection提供了新的stream()方法

流不存储值，通过管道的方式获取值

本质上是函数式的，对流的操作会生成一个结果，不过并不会修改底层的数据源，集合可以作为流的底层数据源

延迟查找，很多流操作（过滤，映射，排序等）都可以延迟实现。


 */




























