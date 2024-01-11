package com.itheima.test;

import java.util.Random;

public class Test7 {
    /*
                        模拟验证码的产生

                        注意: 打印字符类型数组名,不会看到地址值,而是元素的内容
     */

    public static void main(String[] args) {

        char[] chs = getContents();
        String checkCode = getCheckCode(chs);

        System.out.println("产生的验证码为:" + checkCode);

    }

    private static String getCheckCode(char[] chs) {
        Random r = new Random();

        String checkCode = "";

        for (int i = 1; i <= 5; i++) {
            int index1 = r.nextInt(chs.length);
            checkCode += chs[index1];
        }
        return checkCode;
    }

    private static char[] getContents() {
        char[] chs = new char[26 + 26 + 10];

        int index = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            chs[index] = c;
            index++;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            chs[index] = c;
            index++;
        }

        for (char c = '0'; c <= '9'; c++) {
            chs[index] = c;
            index++;
        }
        return chs;
    }
}
