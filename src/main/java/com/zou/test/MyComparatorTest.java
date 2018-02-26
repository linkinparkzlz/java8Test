package com.zou.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparatorTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");

        //按照字母升序排序
        Collections.sort(list);
        System.out.println(list);

        //按照字符串长度排序
        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
        System.out.println(list);

        //字符串长度降序排序
        Collections.sort(list, (item1, item2) -> item2.length() - item1.length());


        //降序排序
        Collections.sort(list, Comparator.comparingInt(String::length).reversed());

        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());

        list.sort(Comparator.comparingInt(String::length).reversed());

        list.sort(Comparator.comparingInt((String item) -> item.length()).reversed());

        //两级排序  两次比较

        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));


        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing((item1, item2) -> item1.toLowerCase().compareTo(item2.toLowerCase())));


        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));

        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));

        Collections.sort(list, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));


        //多级排序
        Collections.sort(list, Comparator.comparingInt(String::length).reversed().
                thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())).thenComparing(Comparator.reverseOrder()));

    }

}






























