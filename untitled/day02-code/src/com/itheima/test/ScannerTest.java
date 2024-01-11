package com.itheima.test;

import java.util.Scanner;

        // https://blog.csdn.net/qq_44111805/article/details/112002957
public class ScannerTest {
    public static void main(String[] args) {
        //1. 召唤Scanner精灵
        Scanner sc = new Scanner(System.in);

        //2. 键盘录入姓名
        System.out.println("请输入您的姓名:");
        String name = sc.next();

        //3. 键盘录入年龄
        System.out.println("请输入您的年龄:");
        int age = sc.nextInt();

        //4. 键盘录入性别
        System.out.println("请输入您的性别:");//可以用字符串来接收性别，因为没有 char gender = sc.nextchar()的存在。
        String gender = sc.next();

        //5. 键盘录入身高
        System.out.println("请输入您的身高:");
        double height = sc.nextDouble();

        //6. 键盘录入婚姻状况
        System.out.println("请输入您的婚姻状况:");
        // boolean flag = sc.nextBoolean();
        String flag1=sc.next();
        System.out.println("注册成功！");

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag1);
    }
}
