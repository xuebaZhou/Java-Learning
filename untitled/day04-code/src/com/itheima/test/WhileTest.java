package com.itheima.test;

public class WhileTest {
    public static void main(String[] args) {
        printDaffodil();
    }
    //while循环，打印水仙花数

    public static void printDaffodil() {

        int i = 100;
        while (i <= 999) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
            i++;
        }
    }
}