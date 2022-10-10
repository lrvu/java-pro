package com.api.string;

public class RegexDemo {
    public static void main(String[] args) {
        String si = "12003355";
        boolean b = si.matches("\\d");
        System.out.println(b);
    }
}
