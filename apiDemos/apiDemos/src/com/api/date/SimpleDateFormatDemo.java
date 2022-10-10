package com.api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        // SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        // System.out.println(format.format(new Date()));

        // 解析字符串为Date对象
        String date = "2022-10-1 00:00:00";
        // 创建和字符串格式对应的SimpleDateFormat对象
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try{
            d = format2.parse(date);
        }catch(ParseException e){
            e.printStackTrace();
        }
        System.out.println(d);
    }
}
