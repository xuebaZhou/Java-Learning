package com.itheima.test;

import java.util.Scanner;
public class OperatorTest1 {
    /*
            需求 : 键盘录入一个整数，求出最大值并打印在控制台
    */
    public static void main(String[] args) {

        //1. 召唤Scanner键盘录入精灵

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数:");
        //2. 指挥精灵从键盘录入三个整数      java与C语言不一样，没有scanf关键字!
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println();
        //3. 计算出前两个整数的最大值  -  tempMax
        int tempMax = num1 > num2 ? num1 : num2;

        //4. 计算出三个整数的最大值  - tempMax 和  第三个整数进行计算

        int max = tempMax > num3 ? tempMax : num3;

        //5. 将最大值打印在控制台
        System.out.println("最大值为:" + max);



        int a = 10;
        int b = 20;
        System.out.println(a > b || a < b && a > b);//这串代码先执行&&(与操作)，在执行||(或操作)。因为前者的优先级高于后者！

        //在自己写代码的时候，如果忘记了优先级的先后,可以在想先执行的那一句话前面加一个括号(英文括号)，
        // 因为括号的优先级是最大的，可以提升该语句的优先级，这样就不需要考虑，该语句的优先级和另一语句的优先级谁先谁后了.

    }
}
