package com.itheima.test;

public class Test5 {

    /*
            arr[0]      arr[arr.length-1-0]
            arr[1]      arr[arr.length-1-1]
            arr[2]      arr[arr.length-1-2]
            ...

            arr[i]      arr[arr.length-1-i]

     */
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        reverseArray2(arr);
        int s=2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void reverseArray2(int[] arr) {
        for ( int start = 0,end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    public static int[] reverseArray1(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }


}
