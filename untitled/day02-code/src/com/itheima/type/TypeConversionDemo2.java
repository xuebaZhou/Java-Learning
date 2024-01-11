package com.itheima.type;

public class TypeConversionDemo2 {
    /*
            类型转换 - 强制转换
                    介绍  : 将取值范围大的数据或变量，给取值范围小的变量赋值，不允许直接赋值，需加入强转
                    注意  : 强制转换【有可能】会出现精度损失
                    格式  : 目标数据类型 变量名 = (目标数据类型)被强转的数据;
     */
    public static void main(String[] args) {

        double a = 12.3;
        int b = (int) a;
        System.out.println(b);               //12

        System.out.println("----------------------------");

        int c = 10;
        byte d = (byte) c;
        System.out.println(d);                  //10

        System.out.println("-----------------------------");

        int num1 = 130;
        byte num2 = (byte) num1;
        System.out.println(num2);                   //-126

    }
}
