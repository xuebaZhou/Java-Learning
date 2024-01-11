package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {

    /*
        数组两种初始化的区别 :

                动态初始化: 手动指定长度,系统分配默认初始化值
                静态初始化: 手动指定元素,系统会根据元素的个数，计算出数组的长度

        两种初始化的使用选择 :

            1.  静态初始化:如果要操作的数据，需求中已经明确给出了,直接静态初始化
                            需求: 已知班级学生成绩为 100 100 90 20 100 ,找出最高分
                            int[] arr = {100,100,90,20,100};

            2.动态初始化: 只明确元素个数,不明确具体数值
                            1.键盘录入5个学生成绩，找最高分
                            2.产生10个1~100之间的随机数,找出最小值
     */
    public static void main(String[] args) {

        /*int[] arr = initArrayFromScanner();
        int max = getMax(arr);
        System.out.println("最大值为:" + max);*/
        int[] randomNums = initArrayFromRandom();
        int min = getMin(randomNums);
        System.out.println("最小值为:" + min);

    }

    private static int[] initArrayFromRandom() {
        Random r = new Random();
        int[] randomNums = new int[10];

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = r.nextInt(100) + 1;
            System.out.println(randomNums[i]);
        }
        return randomNums;
    }

    private static int[] initArrayFromScanner() {
        //  ctrl + alt + m : 抽取方法的快捷键
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘录入班级成绩,请输入班级人数:");
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    /**
     * 从数组中找出最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 从数组中找出最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
