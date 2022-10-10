package com.api.math;

public class PackageDemo {
    public static void main(String[] args) {
        String dbstr = "99.99";
        Double db = Double.valueOf(dbstr);
        System.out.println(db.toString()+0.01); // 99.990.01
        System.out.println(db + 0.01); //100
    }
}
