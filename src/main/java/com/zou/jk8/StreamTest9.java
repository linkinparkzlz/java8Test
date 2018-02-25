package com.zou.jk8;

/*

集合关注的是数据的存储；
流关注的是数据的计算。

中间操作会返回一个Stream对象；终止可能返回其他类型的值，或者不返回值。

 */


/*

串行流和并行流的区别
 */

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamTest9 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(5000000);

        //生成500万个UUID
        for (int i = 0; i < 5000000; ++i) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序：");

        long startTime = System.nanoTime();

        // list.stream().sorted().count(); //串行流  9731
        list.parallelStream().sorted().count(); //并行流   3947

        long endTime = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序耗时：" + millis);

    }


}




























