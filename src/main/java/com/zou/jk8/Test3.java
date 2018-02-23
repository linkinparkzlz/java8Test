package com.zou.jk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

在Java中，Lambda必须依附于函数式接口


 */
public class Test3 {

    public static void main(String[] args) {

        TheInterface i1 = () -> {}; //不接受参数，不返回值.  与函数式接口是对应的。


        //线程 .因为Runnable接口是一个函数式接口，里面的函数式方法run()不接受参数，不返回结果
        new Thread(() -> System.out.println()).start();


        //将集合中的元素每个字母变成大写后输出
        List<String> list = Arrays.asList("hello","world","welcome");
        list.forEach(item -> System.out.println(item.toUpperCase()));

        //将集合中的元素全部转换为大写后，再放入另一个集合中。
        List<String> list2 = new ArrayList<>();
        list.forEach(item -> list2.add(item.toUpperCase()));
        list2.forEach(item -> System.out.println(item));


        //使用流的方式 Stream
        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));

        //方法引用
        list.stream().map(String :: toUpperCase).forEach(System.out :: println);


    }
}


//不接受参数，不返回值
@FunctionalInterface
interface TheInterface {

    void myMethod();
}



@FunctionalInterface
interface TheInterface2 {

    void myMethod2();
}



//@FunctionalInterface
//public interface Runnable {
//    /**
//     * When an object implementing interface <code>Runnable</code> is used
//     * to create a thread, starting the thread causes the object's
//     * <code>run</code> method to be called in that separately executing
//     * thread.
//     * <p>
//     * The general contract of the method <code>run</code> is that it may
//     * take any action whatsoever.
//     *
//     * @see     java.lang.Thread#run()
//     */
//    public abstract void run();
//
//
//}




