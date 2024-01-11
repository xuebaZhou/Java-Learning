package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {

        konckSeven();
    }

    /*
            在控制台打印出 1~100 之间满足逢7过规则的数据
     */
    public static void konckSeven() {
        // 1. 通过循环获取到1！100之间的每一个数字
        for (int i = 1; i <= 100; i++) {
            // 2.数值拆分,拆分出个位和十位
            int ge = i % 10;
            int shi = i / 10 % 10;
            // 3.根据规则加入if判断
            if (ge == 7 || shi == 7 || i % 7 == 0) {
                // 4.打印出满足规则的数据
                System.out.println(i);
            }
        }
    }
}
