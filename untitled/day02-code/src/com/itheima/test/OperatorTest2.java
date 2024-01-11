package com.itheima.test;

public class OperatorTest2 {

    public static void main(String[] args) {

        int x = 10;
        int y = x++;        // y = 10, x = 11;
        int z = ++y;        // y = 11, z = 11;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);


        System.out.println("----------------------");

        int a = 3;
                // 4  + 4    +50
        int b = (++a) + (a++) +(a * 10);        // a++在此处还是一样的，就是先把a原来的值赋值给b，再a++
        System.out.println("a=" + a);           //a = 5
        System.out.println("b=" + b);           //b = 58
    }
}
