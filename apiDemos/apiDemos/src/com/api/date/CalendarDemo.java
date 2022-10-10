package com.api.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        // 通过getInstance方法获取一个Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 直接输出Calendar会看到日历的内容
        System.out.println(calendar);
        // 使用get方法获取某字段的值，例如获取YEAR字段
        System.out.println(calendar.get(Calendar.YEAR));
        // 使用set方法设置某字段的值，例如把YEAR设置为2003
        calendar.set(Calendar.YEAR, 2003);
        System.out.println(calendar.get(Calendar.YEAR));
        // 使用add方法增加/减少某个字段的值，例如把YEAR增加10年
        calendar.add(Calendar.YEAR, 10);
        System.out.println(calendar.get(Calendar.YEAR));
        // 转换为日期对象
        Date date = calendar.getTime();
        System.out.println(date);
        // 转换为时间毫秒值
        long time = calendar.getTimeInMillis();
        System.out.println(time);
    }
}
