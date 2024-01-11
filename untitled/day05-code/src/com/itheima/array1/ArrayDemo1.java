package com.itheima.array1;

public class ArrayDemo1 {
    public static void main(String[] args) {
        arrayTest2();
    }
    /*
        数组介绍 : 一种容器，可以存储同种数据类型的多个值

        数组的使用场景 : 发现手里的数据有多个，并且这多个数据还属于同一组数据，就可以考虑使用数组容器进行维护.

        初始化 : 在内存中，为数组容器开辟空间,并将数据存入容器的过程.

        数组的定义格式  :

                1.  数据类型[] 数组名;
                2.  数据类型 数组名[];

                注意 : 这种定义格式，定义出来的，只是数组类型的变量而已，内存中还没有创建出数组容器.
     */

    public static void arrayTest1() {
        int[] array;

        int array2[];
        // System.out.println(array2);
    }


    /*
        数组的静态初始化格式 :

                1. 完整格式 :
                                    数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};

                2. 简化格式 :
                                     数据类型[] 数组名 = {元素1,元素2,元素3...};



        打印数组名  :
                [I@27d6c5e0

                @ :  分割符
                [ : 当前空间，是数组类型的
                I : 当前数据类型，是int类型
                27d6c5e0 : 数组的十六进制内存地址
     */
    public static void arrayTest2() {
        int[] arr1 =new int[]{11, 22, 33};
        double[] arr2 = {11.1, 22.2, 33.3};

        System.out.println(arr1);
        System.out.println(arr2);
    }
}
