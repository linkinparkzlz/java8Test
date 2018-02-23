package com.zou.jk8;

import java.util.function.Supplier;

public class StudentTest {

    public static void main(String[] args) {

        //可以将Supplier当做一个工厂来使用
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());


        //使用方法引用
        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());


    }


}












































