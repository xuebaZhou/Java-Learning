package com.itheima.demo;

public class SwapDemo1 {
    /*
            今后只要涉及到数据交换,联想到第三方的变量
        int a = 10;
        int b = 20;

        int c = a;
        a = b;
        b = c;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        实现两个变量的数据交换,不允许定义第三方变量

         a = a + b;
        b = a - b;
        a = a - b;
     */

    /*
        ^ 异或 :

                特点:
                        1. 相同为false, 不同为true
                        2. 一个数字, 被另外一个数字异或两次, 该数本身不变
     */
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a ^ b;      // a = 10 ^ 20;
        b = a ^ b;      //b = ( 10 ^ 20 ) ^ 20 = 10;
        a = a ^ b;      //a = ( 10 ^ 20 ) ^ 10 = 20;


        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
