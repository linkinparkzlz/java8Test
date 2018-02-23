package com.zou.jk8;

import java.util.function.Supplier;

public class SupplierTest {


    public static void main(String[] args) {

        //不接受参数，返回一个结果
        Supplier<String>  supplier = () -> "hello world";

        System.out.println(supplier.get());

    }


}

















































