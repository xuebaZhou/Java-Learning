package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 20, 90, 90};

        int max = getMax(arr);
        System.out.println("最高分为:" + max);

        int min = getMin(arr);
        System.out.println("最小值为:" + min);

        int sum = getSum(arr);
        System.out.println("总成绩为:" + sum);

        double average = getAverage(arr);
        System.out.println("平均分为:" + average);

        int count = getCount(arr);
        System.out.println("成绩低于平均值同学的个数为:" + count);


    }

    public static int findMax1() {
        int[] arr = {5, 44, 33, 55, 22};
        int max = arr[0], min = arr[0], a = 0, b = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                a = i;
            }
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }

    /*
            需求 :
            已知班级学生成绩为
            int[] arr = {100,50,20,90,90};
            1. 找出数组最大值,并打印在控制台
            2. 找出数组最小值,并打印在控制台
            3. 求总成绩,并打印在控制台
            4.计算出平均值,并打印在控制台
            5. 统计出低于平均值元素的个数
     */

    /**
     * 从数组中找最大值
     *
     * @param arr
     * @return
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {//由于max初始化为arr[0]了，故在比较时可以从第二个元素开始比较，即arr[1]开始。
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }

    /**
     * 从数组中找最小值
     *
     * @param arr
     * @return
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        return min;
    }

    /**
     * 数组求和
     *
     * @param arr
     * @return
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 数组求平均值
     *
     * @param arr
     * @return
     */
    public static double getAverage(int[] arr) {
        double sum = 0, avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (sum * 1.0) / (arr.length);//防止在计算过程中触发 整型运算 ，从而丢失精度。
        return avg;
    }

    /**
     * 统计出低于平均值元素的个数
     */
    public static int getCount(int[] arr) {
        //1. 定义计数器变量
        int count = 0;
        //2. 计算平均分
        double average = getAverage(arr);      //上面有方法可以进行调用，不需要再写了
        //3. 统计
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        return count;
    }
}
