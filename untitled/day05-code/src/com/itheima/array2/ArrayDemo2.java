package com.itheima.array2;

public class ArrayDemo2 {

    /*
            二维数组动态初始化 :

                格式: 数据类型[][] 数组名 = new 数据类型[m][n];

                m : 这个二维数组中,可以存放多少个一维数组
                n : 每一个一维数组中,可以存放多少个元素
     */
    public static void main(String[] args) {

        //  可将提前创建好的一维数组,直接存入二维数组中
        int[] arr1 = {11, 22, 33};
        int[] arr2 = {44, 55, 66};

        int[][] arr = new int[2][3];
        arr[0] = arr1;
        arr[1] = arr2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }


    }

    private static void arrayTest1() {
        // 这个二维数组可以存储2个一维数组,每一个一维数组中可以存放3个元素
        int[][] arr = new int[2][3];

        arr[0][0] = 11;
        arr[0][2] = 33;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
