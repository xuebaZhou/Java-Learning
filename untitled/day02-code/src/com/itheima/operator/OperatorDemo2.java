package com.itheima.operator;

public class OperatorDemo2 {
    /*
        自增自减运算符 :

           ++ : 让变量自身的值 + 1
           -- : 让变量自身的值 - 1

     1. 单独使用 : 一句代码中，只做++，或者是--
                    ++，-- 在变量的前面，还是后面，没有区别的
                    eg:
                        int a = 10,b=10;
                        a++;              // a = a + 1;或者++a;
                        b--;              // b = b - 1;或者--b;
                        System.out.println(a);
                        System.out.println(b);

     2. 参与运算使用 :

                    ++在前 : 先自增，在操作

                    ------------------------------

                    int a = 10;
                    int b = ++a;

                    System.out.println("a=" + a);               // a = 11
                    System.out.println("b=" + b);               // b = 11

                    ------------------------------

                    ++在后 : 先操作，在自增
                                - 将该变量原本记录的值提取出来做操作，然后变量再自增
     */
    public static void main(String[] args) {

        int a = 10;
        int b = a++;     // b = 10, a = 11

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int c = 100;
        int d = ++c;
        System.out.println("c=" + c);
        System.out.println("d=" + d);

        // ++, -- 只能操作变量，不能操作常量！
    }
}
