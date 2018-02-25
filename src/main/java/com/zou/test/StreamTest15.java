package com.zou.test;

import com.zou.jk8.Studen;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest15 {


    public static void main(String[] args) {

        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 30);
        Student student3 = new Student("wangwu", 146, 20);
        Student student4 = new Student("zhaoliu", 199, 50);
        Student student5 = new Student("zhaoliu", 199, 50);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);


        //多级分组  先根据分数进行分组，再根据名字进行分组

        Map<Integer, Map<String, List<Student>>> map = students.stream().collect(Collectors.groupingBy(Student::getScore, Collectors.groupingBy(Student::getName)));

        System.out.println(map);

        // {146={wangwu=[Student{name='wangwu', score=146, age=20}]}, 100={zhangsan=[Student{name='zhangsan', score=100, age=20}]}, 199={zhaoliu=[Student{name='zhaoliu', score=199, age=50}, Student{name='zhaoliu', score=199, age=50}]}, 90={lisi=[Student{name='lisi', score=90, age=30}]}}


        //二次分区
        Map<Boolean, Map<Boolean, List<Student>>> map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.partitioningBy(student -> student.getScore() > 90)));

        System.out.println(map2);


        Map<Boolean, Long> map1 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.counting()));

        System.out.println(map1);
    }
}

































