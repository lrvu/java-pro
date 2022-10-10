package com.api.math;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double da = 0.1;
        double db = 0.2;
        // 使用双浮点类型会出现精度失真
        System.out.println(da+db); // 0.30000000000000004

        BigDecimal a = BigDecimal.valueOf(0.1);
        BigDecimal b = BigDecimal.valueOf(0.2);
        // 使用BigDecimal可以避免失真
        System.out.println(a.add(b)); // 0.3
    }
}
