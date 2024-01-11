package com.itheima.operator;

public class OperatorDemo3 {
    /*
        关系运算符 (比较运算符) :

            >
            >=
            <
            <=
            ==
            !=
            注意事项 ：
                    关系运算符的结果都是 boolean 类型，要么是true,要么是false
                    千万不要吧 == 误写为 =

     */
    public static void main(String[] args) {
        System.out.println(10 > 20);        //false
        System.out.println(10 >= 20);        //false
        System.out.println(10 < 20);        //true
        System.out.println(10 <= 20);        //true
        System.out.println(10 == 20);        //false
        System.out.println(10 != 20);        //true
         //System.out.println(10=20);  该条语句就会报错
    }
}
