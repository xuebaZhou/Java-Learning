package com.itheima.variable;

public class VariableDemo1 {
    /*
        变量介绍：内存中的储存空间，空间中记录着经常发生改变的数据

        变量的定义格式：

                    数据类型  变量名 = 数据值;
                    数据类型  :  整数  : int
    */

    public static void main(String[] args) {
        int salary = 12000;
        //使用变量：根据变量的名字使用
        System.out.println(salary);

        salary = 15000;//没有定义出新的变量，没有新的空间。这一步只是在找已有的变量
        System.out.println(salary);

        int age = 18;//定义了一个新的变量，开辟了一个新的空间。
        System.out.println(age);
    }
}
