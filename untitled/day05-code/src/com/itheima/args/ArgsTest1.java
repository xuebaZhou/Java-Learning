package com.itheima.args;

public class ArgsTest1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        change(number);
        System.out.println("调用change方法后:" + number);

    }
    public static void change(int number) {
        System.out.println("在调用change方法中有："+number);
        number = 200;
        System.out.println("在调用change方法中有："+number);
    }
}

