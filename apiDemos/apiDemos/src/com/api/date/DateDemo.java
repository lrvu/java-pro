package com.api.date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 创建当前时间
        Date now = new Date();
        // 输出当前时间
        System.out.println(now);

        // 通过Date的getTime方法获取时间戳计算代码运行时间
        long start = new Date().getTime();
        for (int i = 0; i < 1000000; i++)
            System.out.println("输出:" + i);
        long end = new Date().getTime();
        System.out.println("共耗时："+(end - start) / 1000.0 + "s");
    }
}
