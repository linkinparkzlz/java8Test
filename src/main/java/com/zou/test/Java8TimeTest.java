package com.zou.test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Java8TimeTest {


    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(); //当前时间

        System.out.println(localDate);

        System.out.println(localDate.getYear() + "," + localDate.getMonthValue() + "," + localDate.getDayOfMonth());


        System.out.println("------------------------");

        LocalDate localDate2 = LocalDate.of(2017, 3, 3);
        System.out.println(localDate2);

        System.out.println("------------------------");

        //关注月份和天，不关注年份的时候
        LocalDate localDate3 = LocalDate.of(2010, 3, 25);
        MonthDay monthDay = MonthDay.of(localDate3.getMonth(), localDate3.getDayOfMonth());
        MonthDay monthDay2 = MonthDay.from(LocalDate.of(2011, 3, 25));

        if (monthDay.equals(monthDay2)) {
            System.out.println("equals");
        } else {
            System.out.println("not  equals");
        }

        System.out.println("------------------------");


        LocalTime time = LocalTime.now();
        System.out.println(time);


        LocalTime time2 = time.plusHours(3).plusMinutes(20);
        System.out.println(time2);

        System.out.println("------------------------");


        //两周之后
        LocalDate localDate1 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate1);

        System.out.println("------------------------");

        LocalDate localDate4 = localDate.minus(2, ChronoUnit.MONTHS);
        System.out.println(localDate4);


        Clock clock = Clock.systemDefaultZone(); //默认时区
        System.out.println(clock.millis());


        System.out.println("------------------------");


        LocalDate localDate5 = LocalDate.now();
        LocalDate localDate6 = LocalDate.of(2017, 3, 19);

        System.out.println(localDate5.isAfter(localDate6));

        System.out.println("------------------------");

        Set<String> set = ZoneId.getAvailableZoneIds();
        set.stream().forEach(System.out::println);

        System.out.println("------------------------");
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");

        LocalDateTime localDateTime = LocalDateTime.now();

        //带有时区的日期
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        System.out.println("------------------------");

        //带有年份个月份
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfMonth());
        System.out.println(yearMonth.isLeapYear()); //是不是闰年

        System.out.println("------------------------");

        YearMonth yearMonth1 = YearMonth.of(2016, 2);
        System.out.println(yearMonth1);
        System.out.println(yearMonth1.lengthOfMonth());
        System.out.println(yearMonth.lengthOfYear());
        System.out.println(yearMonth1.isLeapYear()); //是否是闰年

        System.out.println("------------------------");

        //两个日期之间间隔
        LocalDate localDate7 = LocalDate.now();
        LocalDate localDate8 = LocalDate.of(2017, 3, 25);

        Period period = Period.between(localDate7, localDate8);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("------------------------");

        //UTC输出
        System.out.println(Instant.now());


    }


}






























