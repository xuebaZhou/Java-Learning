package com.itheima.array2;

public class ArrayDemo1 {

    /*
        细节 : 二维数组在存储一维数组的时候,具体存储的是一维数组的地址值         这里也印证了    地址值也是值  这一说法

        二维数组的元素访问格式 :

                    数组名[m索引][n索引] :

                    m索引  : 指定访问哪一个一维数组
                    n索引  : 访问一维数组中的哪一个元素
     */
    public static void main(String[] args) {

        int[][] arr = {
                {11, 22, 33},
                {44, 55, 66},
        };

        System.out.println(arr);            //   [[I@27d6c5e0

        System.out.println(arr[0]);         //   [I@4f3f5b24
        System.out.println(arr[1]);         //   [I@15aeb7ab

        System.out.println(arr[1][1]);
    }
}
