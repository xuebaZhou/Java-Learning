package com.itheima.test;

import java.util.Scanner;

public class Test5_1 {

    /*
            arr[0]      arr[arr.length-1-0]
            arr[1]      arr[arr.length-1-1]
            arr[2]      arr[arr.length-1-2]
            ...

            arr[i]      arr[arr.length-1-i]

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素个数:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素的元素值:");
            arr[i] = sc.nextInt();
        }
        System.out.println("未交换前的数组为:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"   ");
        }
        int[] arr1 = exchangeArray(arr);
        System.out.println("交换后的数组为:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"   ");
        }
    }
    public static int[] exchangeArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
