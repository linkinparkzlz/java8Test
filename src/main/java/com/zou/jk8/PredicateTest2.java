package com.zou.jk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        PredicateTest2 test = new PredicateTest2();
        //找出集合中所有的偶数
        test.conditionFilter(list, item -> item % 2 == 0);

        //找出所有的奇数
        test.conditionFilter(list, item -> item % 2 != 0);

        //找出所有大于5的数
        test.conditionFilter(list, item -> item > 5);


        //找出所有小于3的数
        test.conditionFilter(list, item -> item < 3);

        //打印出所有
        test.conditionFilter(list, item -> true);

        //找出大于5并且是偶数
        test.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0);


    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {

        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }

    }


    //  Precidate的 and   or   negate
    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer integer : list) {

            if (predicate.and(predicate2).test(integer)) {
                System.out.println(integer);
            }
        }
    }


}














































