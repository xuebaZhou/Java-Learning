package com.itheima.args;

public class ArgsTest1_1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        //int result = change(number);
        number = change(number);// 也可以直接用number进行接收
        System.out.println("调用change方法后:" + number);
    }

    public static int change(int number) {
        number = 200;
        return number;
    }
}
