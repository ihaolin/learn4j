package org.learn4j.core.java03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 日期时间类测试
 */
public class DateTimeTest {

    public static void main(String[] args) {

        Date now = new Date();  // Date对象代表当前时间点
        System.out.println(now.getTime());  // 距离GMT(格林威治)时间点的毫秒数

        // 当涉及日期时间计算时，可以使用LocalDate，LocalTime，LocalDateTime等类

        // LocalDate日期类
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate.getDayOfWeek().getValue()); // 获取今天星期几
        System.out.println(currentDate.plusDays(1).getDayOfWeek().getValue()); // 获取明天星期几

        LocalDate firstDayOf2019 = LocalDate.of(2019, 1, 1);    // 手动构造一个日期
        System.out.println(firstDayOf2019.getDayOfYear());      // 1 当年第几天

        // LocalTime时间类
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime.minusHours(1));          // 1小时前的时间

        // LocalDateTime日期时间类
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // 当前时间

        // DateTimeFormatter日期时间格式化类
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(currentDateTime.format(dateTimeFormatter));  // 如 2020-04-19 11:36:01
    }
}
