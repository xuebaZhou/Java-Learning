package com.itheima.permissions;

import java.util.Scanner;

public class math3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] != 0) {
                    for (j = j + 1; j < n; j++) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        String[][] arr1 = Matrix(arr, n);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

    }

    public static String[][] Matrix(int arr[][], int n) {
        String[][] arr1 = new String[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr1[i][j] = "0";
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    arr1[j][i] = 1 + "/" + arr[i][j];
                }
            }
        }
        return arr1;
    }
}
