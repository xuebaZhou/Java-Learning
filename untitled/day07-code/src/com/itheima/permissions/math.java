package com.itheima.permissions;


import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lun = sc.nextInt();
        String[] arr = new String[lun];
        for (int i = 0; i < lun; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int sum1 = max - min + 1;
            int sum2 = 0;
            for (int j = min; j <= max; j++) {
                if (isPrime(j) == false) {
                    sum2++;
                }
            }
            for (int j = sum2; j >= 2; j--) {
                if (sum2 % j == 0 && sum1 % j == 0) {
                    sum2 /= j;
                    sum1 /= j;
                    break;
                }
            }
            if (sum2 == 0) {
                arr[i] = "0/1";
            } else {
                arr[i] = sum2 + "/" + sum1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
