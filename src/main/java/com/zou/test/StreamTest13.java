package com.zou.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {


    public static void main(String[] args) {

        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 30);
        Student student3 = new Student("wangwu", 146, 20);
        Student student4 = new Student("zhaoliu", 199, 50);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);


        //按照姓名进行分组
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);

        //根据分数进行分组
        Map<Integer, List<Student>> map1 = students.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println(map1);


        Map<String, Long> map2 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(map2);

        Map<String, Double> map3 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(map3);


        //分区： 是分组的一种的特殊情况
        Map<Boolean, List<Student>> map4 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 80));
        System.out.println(map4);


    }
}


























































