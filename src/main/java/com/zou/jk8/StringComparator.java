package com.zou.jk8;

import java.util.*;

public class StringComparator {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu");

        //以前的排序方式
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(names);


        //使用Lambda表达式
        Collections.sort(names, (String o1, String o2) -> {
            return o2.compareTo(o1);
        });

        System.out.println(names);


        //根据idea的智能提示，我们可以使用reverseOrder来代替：
        Collections.sort(names, Comparator.reverseOrder());

        System.out.println(names);


    }

}













































































