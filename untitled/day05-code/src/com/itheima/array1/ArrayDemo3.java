package com.itheima.array1;

public class ArrayDemo3 {
    public static void main(String[] args) {
        arrayTest();
    }

    /*
            数组的动态初始化 :

                    在初始化的时候,只需要指定数组的长度,系统就会分配默认值(初始值)

                    格式 : 数据类型[] 数组名 = new 数据类型[长度];

                    默认值的分类 :

                            整数 : 0
                            小数 : 0.0
                            布尔 : false
                            -----------------------------------
                            字符 : '\u0000'           -----> Unicode字符     ------>常见的体现是空白字符
                            引用数据类型 : null

                            引用数据类型 : 数组, 类, 接口

                            String : 本质是个   类

     */
    public static void arrayTest() {

        int[] arr1 = new int[3];
        double[] arr2 = new double[3];
        boolean[] arr3 = new boolean[3];
        char[] arr4 = new char[3];
        String[] arr5 = new String[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

    }
}
