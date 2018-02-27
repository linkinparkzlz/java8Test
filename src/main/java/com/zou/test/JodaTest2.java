package com.zou.test;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

public class JodaTest2 {

    //标准的UTC时间格式： 2014-11-04T09:22:44.876Z

    //给定UTC字符串，将其转换成名日期类型

    public static Date convertUTC2Date(String utcDate) {

        try {

            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();

        } catch (Exception e) {
            return null;

        }

    }

    //给定一个Date类型，将其转换为UTC格式

    public static String convertDate2UTC(Date javaDate) {

        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }


    //将Java日期类型转换为指定的格式
    public static String convertDate2LocalByDateFormat(Date javaDate, String dateFormat) {

        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }


    //测试
    public static void main(String[] args) {

        System.out.println(JodaTest2.convertUTC2Date("2014-11-04T09:22:44.876Z"));

        System.out.println(JodaTest2.convertDate2UTC(new Date()));


        System.out.println(JodaTest2.convertDate2LocalByDateFormat(new Date(), "yyyy-MM-dd HH:mm:ss"));


    }


}





































