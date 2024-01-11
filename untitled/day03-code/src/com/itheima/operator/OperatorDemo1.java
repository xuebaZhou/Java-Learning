package com.itheima.operator;

public class OperatorDemo1 {
    /*
        赋值运算符 :

             1.基本赋值运算符

                        = : 将等号右侧的数据，赋值给左边的变量
                        eg
                        int num = 10;

             2.扩展赋值运算符

                        += : 将符号左右两边的数据，做加法运算，再将结果赋值给左边.
                        -= : 将符号左右两边的数据，做减法运算，再将结果赋值给左边.
                        *= : 将符号左右两边的数据，做乘法运算，再将结果赋值给左边.
                        /= : 将符号左右两边的数据，做除法运算，再将结果赋值给左边.
                        %= : 将符号左右两边的数据，做取模运算，再将结果赋值给左边.

         ------------------------------------------------------------------------------------------------
         细节补充 :
                        扩展赋值运算符，内部自带强转效果

                        short s = 1;
                        s = s + 1;     有错误，因为s为short类型，而1为整数的字面量，所有整数默认为int，而int类型
                        结果不能赋值给short类型变量，会出现编译错误。

                        解决办法：
                                 short s = 1;
                                 s =(short) (s + 1) ;
                                 System.out.println(s);
     */
    public static void main(String[] args) {

        int num = 10;
        num -= 20;
        System.out.println(num); // -10

        short s = 1;
        s += 1;     //此语句等效于  s = (short)(s + 1);
        //  s=s+1;  该条语句会报错
        System.out.println(s);// 2

        double a = 12.3;
        int b = 10;
        b += a;      //等价于 b =(int)(b + a);
        System.out.println(b);                  //22

    }
}
