package com.itheima.test;

public class ArrayTest4 {
    /*
        二维数组遍历操作

                1. 遍历二维数组,获取到每一个一维数组
                2. 继续遍历一维数组,获取到具体的元素
     */
    public static void main(String[] args) {
        int[][] arr = {
                {11, 22, 33},
                {33, 44, 55}
        };
        printArray(arr);
        int sum = getSum(arr);
        System.out.println(sum);
    }

    /**
     * 遍历并打印二维数组中元素
     * 已知一个二维数组 arr = { { 11 , 22 , 33 } ， { 33 , 44 , 55 } };
     * 遍历该数组,取出所有元素并打印
     */
    public static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            // arr[i] : 每一个一维数组
            // 继续遍历一维数组，获取内部的元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }

        }


    }

    /**
     * 遍历一个二维数组并求和
     * 已知一个二维数组 arr = { { 11 , 22 , 33 } ， { 33 , 44 , 55 } };
     * 对内部存储的元素累加求和,并将结果输出在控制台
     */
    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
