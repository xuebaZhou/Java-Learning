package com.itheima.test;

import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
             int[] arr = {19, 28, 37, 46, 50};

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要查找的元素:");
            int num = sc.nextInt();
            int index = getIndex(arr, num);

             System.out.println(index);
    }

    /*

                设计一个方法,查找元素在数组中第一次出现的索引位置

                键盘录入一个数据,查找该数据在数组中的索引，
                并在控制台输出找到的索引值。
                没有找到,则输出-1
     */

    public static int getIndex(int[] arr, int num) {
        // 1. 假设要查找的元素,在数组中就是不存在的
        int index = -1;
        // 2. 遍历数组,获取内部的每一个元素
        for (int i = 0; i < arr.length; i++) {
            // 3. 比较
            if (arr[i] == num) {
                // 4. 找到了,让index变量记录正确的索引位置
                index = i;
            }
        }
        return index;
    }
}
