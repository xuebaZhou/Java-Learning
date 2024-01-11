package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        while (true) {
            System.out.println("录入一个元素值:");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            int botton = getIndex(arr, b);
            if (botton != -1) {
                System.out.println("索引为：" + botton);
            } else {
                System.out.println("没有找到可以匹配的数组值" +"返回值为"+ botton);
            }
        }

    }

    public static int getIndex(int[] arr, int b) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                index = i;
                return index;
            }
        }
        return -1;
    }
}
