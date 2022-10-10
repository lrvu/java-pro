package com.api.system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("正常运行");

        // 获取系统当前时间毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 做数组的拷贝
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8};
        int[] arr2 = new int[6];
        // arraycopy(src, srcPos, dest, destPos, length)
        /* 
            将从arr1中的3个元素复制到arr2中,
            源数组的开始下标为2，
            目标数组开始位置为1,
            复制元素长度为3 .
        */
        System.arraycopy(arr1, 2, arr2, 1, 3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // 退出JVM虚拟机
        System.exit(0);
        System.out.println("程序已退出，所以这一行代码不会被输出");
    }
}
