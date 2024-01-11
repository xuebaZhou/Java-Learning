package com.itheima.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        //getSum();
        //toTest();
        //findMaxandMin();
        int[] arr1 = {12, 32, 52, 123, 453, 55};
        int sumimprove = getSumimprove(arr1);
        System.out.println("偶数和为:" + sumimprove);
    }

    /*
            数组遍历 : 将数中的每一个(所有)的内容，取出来进行操作
     */

    public static void printArray1() {
        int[] arr = {11, 22, 33, 44, 55};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //弊端 : 代码过于臃肿，复用性很差
    }

    //使用循环改进
    public static void printArray2() {
        int[] arr = {11, 22, 33, 44, 55};

        for (int i = 0; i < 5; i++) {
            // i = 0 1 2 3 4
            System.out.println(arr[i]);
            //弊端 : 循环次数写死了
        }
    }

    // 使用数组名.length
    //       数组名.length : 动态获取到数组的长度(元素的个数)
    public static void printArray3() {
        int[] arr = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);

        // 数组遍历的快捷键 : 数组名.fori   再敲一下回车
    }

    /*
        对数组中偶数元素做求和操作

        数组遍历的场景 : 如果要完成的需求，是需要操作到数组中的[每一个]元素，就需要对数组进行遍历操作
     */
    public static void getSum() {

        int[] arr = {11, 22, 33, 44, 55};

        //1. 定义求和变量，准备进行累加操作
        int sum = 0;
        //2. 遍历数组，获取到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3. 判断当前元素是否为偶数
            // i : 索引
            // arr[i] : 元素
            if (arr[i] % 2 == 0) {
                // 4 . 是的话，进行累加求和
                sum += arr[i];
            }
        }
        // 5 . 遍历结束后，将求和结果打印
        System.out.println("偶数和为 :" + sum);
    }

    public static int getSumimprove(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void toTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0) {
                System.out.println(arr[i] + "不是三的倍数。");
            } else {
                System.out.println(arr[i] + "是三的倍数。");
            }
        }
    }

    public static void findMaxandMin() {
        int[] arr = {5, 44, 33, 55, 22};
        int max = arr[0], min = arr[0], a = 0, b = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                a = i;
            }
            max = max > arr[i] ? max : arr[i];
            if (arr[i] < min) {
                b = i;
            }
            min = min < arr[i] ? min : arr[i];
        }
        System.out.println("数组元素的最大值为:" + max);
        System.out.println("数组元素的最小值为:" + min);
        System.out.println("最大值数组元素的下标为:" + a);
        System.out.println("最小值数组元素的下标为:" + b);
    }
}
