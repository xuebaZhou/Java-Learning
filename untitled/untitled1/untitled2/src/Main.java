
//import java.lang.Math;
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        //不能使用基本数据类型
//        Integer[] arr = {5, 4, 7, 9, 2, 12, 54, 21, 1};
//        //降序
//        Arrays.sort(arr, (a, b) -> {
//            //返回值>0交换
//            return b - a;
//        });
//        System.out.println(Arrays.toString(arr));
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // 读取输入的多项式系数和指数
//        String[] input = sc.nextLine().split(" ");  // 以空格分隔当前的字符串
//        // 遍历系数和指数数组
//        for (int i = 0; i < input.length; i += 2) {
//            int coefficient = Integer.parseInt(input[i]); // 当前项的系数
////            将字符串数组 input 中的 input[i] 转换为整数类型并赋值给变量 coefficient
//            int exponent = Integer.parseInt(input[i + 1]); // 当前项的指数
//            coefficient *= exponent; // 求导数后的系数
//            exponent--; // 求导数后的指数
//            // 输出非零项的系数和指数
//            if (coefficient != 0) {
//                System.out.print(coefficient + " " + exponent);
//                // 如果不是最后一项，输出空格
//                if (i != input.length - 2) {
//                    System.out.print(" ");
//                }
//            }
//        }
//        sc.close(); // 关闭输入流
//    }


    // 判断一个数是否是素数
    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 获取一个数的质因数列表
    public static List<Long> getPrimeFactors(long n) {
        List<Long> primeFactors = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] parts = input.split(" ");
            String methodName = parts[0];
            long number = Long.parseLong(parts[1]);

            if (methodName.equals("factors")) {
                List<Long> primeFactors = getPrimeFactors(number);
                for (long primeFactor : primeFactors) {
                    System.out.print(primeFactor + " ");
                }
                System.out.println();
            } else if (methodName.equals("prime")) {
                boolean isPrime = isPrime(number);
                System.out.println(isPrime);
            } else {
                System.out.println("无效方法名");
            }
        }
    }
}





