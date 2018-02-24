package com.zou.jk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/*

方法引用：
1.类名 :: 静态方法名
2.引用名 :: 实例方法名
3. 类名 :: 实例方法名
4. 构造方法引用      类名 :: new

 */
public class MethodReferenceTest {


    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }


    public static void main(String[] args) {

        Studen studen1 = new Studen("zhangsan", 10);
        Studen studen2 = new Studen("lisi", 90);
        Studen studen3 = new Studen("wangwu", 45);
        Studen studen4 = new Studen("zhaoliu", 33);

        List<Studen> studens = Arrays.asList(studen1, studen2, studen3, studen4);

        //使用Lambda表达式排序
        studens.sort((studenParam1, studenParam2) -> Studen.compareStudentByScore(studenParam1, studenParam2));

        studens.forEach(studen -> System.out.println(studen.getScore()));

        //使用方法引用
        studens.sort(Studen::compareStudentByScore);


        StudenComparator studenComparator = new StudenComparator();
        studens.sort((studenParam1, studnParam2) -> studenComparator.compareStudentByScore(studenParam1, studnParam2));
        studens.forEach(studen -> System.out.println(studen.getScore()));

        //实例方法引用
        studens.sort(studenComparator::compareStudentByScore);
        studens.forEach(studen -> System.out.println(studen.getScore()));


        studens.sort((studenParam1, studenParam2) -> studenComparator.compareStudentByName(studenParam1, studenParam2));
        studens.forEach(studen -> System.out.println(studen.getScore()));

        studens.sort(studenComparator::compareStudentByName);
        studens.forEach(studen -> System.out.println(studen.getScore()));


        //类名 :: 实例方法名
        studens.sort(Studen::compareByScore);
        studens.forEach(studen -> System.out.println(studen.getScore()));

        studens.sort(Studen::compareByName);
        studens.forEach(studen -> System.out.println(studen.getName()));


        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjin", "bengjing");

        Collections.sort(cities, (city1, city2) -> city1.compareToIgnoreCase(city2));
        cities.forEach(city -> System.out.println(city));

        Collections.sort(cities, String::compareToIgnoreCase);


        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(test.getString(String::new));


        System.out.println(test.getString2("hello", String::new));


    }
}






































