package com.itheima.demo;

public class SwapDemo2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        // 1. 确定好,谁与谁做交换
        // 2. 定义第三方变量
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
