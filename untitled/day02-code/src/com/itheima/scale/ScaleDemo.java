package com.itheima.scale;

public class ScaleDemo {
    /*
        计算机中进制的分类 :

                十进制 : 默认
                二进制 :0b开头
                八进制 :0开头
                           - 今后编写数值，尽量不要以0开头
                eg :
                要表示009时，只能用字符串表示，用009表示会报错！因为八进制没有9这一数字！

                十六进制 :   0x开头
                         -   今后看到一组数据是0~9，字母a-f组合排列的，要知道这是十六进制数据。
     */
    public static void main(String[] args) {
        System.out.println(110);
        System.out.println(0b110);
        System.out.println(0110);
        System.out.println(0x110);
    }
}
