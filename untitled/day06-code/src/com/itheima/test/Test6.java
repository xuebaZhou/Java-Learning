package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    /*
            6个评委为选手打分,分数为0~100的整数分。
            去掉一个最高分和一个最低分后 的4个评委平均值
     */
    public static void main(String[] args) {

        int[] arr = initData();

        int sum = getSum(arr);

        int max = getMax(arr);

        int min = getMin(arr);

        // 5. 求平均分 (总和 - 最大值 - 最小值) / 4       4这个数据写死了，不太好！
        double avg = ((sum - max - min) * 1.0) / (arr.length - 2);

        System.out.println("选手的最后得分为 :" + avg);

    }

    /**
     * 数组中找最小值
     * @param arr
     * @return
     */
    private static int getMin(int[] arr) {
        // 4. 求最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 数组中找最大值
     * @param arr
     * @return
     */
    private static int getMax(int[] arr) {
        //3. 求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 数组求和
     * @param arr
     * @return
     */
    private static int getSum(int[] arr) {
        //2. 求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 此方法用于录入6个评委的分数
     * @return
     */
    private static int[] initData() {
        int[] arr = new int[6];

        //1. 输入6个评委的打分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6个评委的打分:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分:");
            int score = sc.nextInt();
            // 判断成绩是否正确
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("您的分数输入有误,请检查是否是0~100之间的");
                i--;    //  第一个分数输入有误,就要继续输入第一个分数
            }
        }
        return arr;
    }
}
