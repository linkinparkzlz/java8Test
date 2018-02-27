package com.zou.test;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class JodaTest1 {

    public static void main(String[] args) {

        DateTime today = new DateTime(); //今天
        DateTime tomorrow = today.plusDays(1); //明天

        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));

        System.out.println("******************8");

        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));

        System.out.println("******************");


        //当前时区的日期
        LocalDate localDate = new LocalDate();
        System.out.println(localDate);
        System.out.println("******************");

        //当前这天后面三个月第一天的日期
        localDate = localDate.plusMonths(3).dayOfMonth().withMinimumValue();
        System.out.println(localDate.toString("yyyy-MM-dd"));

        System.out.println("******************");

        //两年前的第三个月最后一天日期
        DateTime dateTime = new DateTime();

        DateTime dateTime2 = dateTime.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMinimumValue();

        System.out.println(localDate.toString("yyyy-MM-dd"));


    }


}


































