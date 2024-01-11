package com.itheima.test;

public class TypeConversionTest {
    /*
          类型转换面试题 : 下列代码是否存在错误，如果有，请指出说明 ，并改正。

          byte b1 = 3;
          byte b2 = 4;
          byte b3 = b1 + b2;

          错误原因:
                        b1和b2是两个byte类型，在运算的时候，会提升为int类型
                        提升之后，就是两个int在运算了，运算的结果还是int。
                        将int类型的结果，赋值给byte类型的变量，属于大给小，不能直接给。

                      正确改法:
                         byte b1 = 3;
                         byte b2 = 4;
                         byte b3 = (byte)(b1 + b2);          //byte b3 = (byte)b1+(byte)b2;    此条语句会报错！
  https://blog.csdn.net/HU1656/article/details/96375717    Java中Byte类型的运算细节
                         System.out.println(b3);

              请问 : byte b = 3 + 4;     这一条语句对吗？

              错误理解 :
              这里的3和4是两个字面量，之前说过，所有整数默认都是int类型，所以这里应该是两个int做运算
              运算后的结果还是int，int类型结果给byte类型变量赋值，大的给小的，不能直接给，编译错误.

              正确理解 :
              Java存在常量优化机制 : 在编译的时候(javac)(还未进行执行)就会将3和4这两个字面量进行运算.
                                       产生字节码文件 : byte b = 7;  而此条语句正确，则上述语句正确

     */
    public static void main(String[] args) {
//        byte b1 = 3;
//        byte b2 = 4;
//        byte b3 = (byte)(b2+b1);
//        System.out.println(b3);
        byte b = 3 + 4;
        System.out.println(b);
    }
}
