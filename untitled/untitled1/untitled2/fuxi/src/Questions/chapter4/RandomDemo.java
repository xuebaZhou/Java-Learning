package Questions.chapter4;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10);

        System.out.println("排序前的数组：");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("排序后的数组：");
        printArray(numbers);
    }

    // 生成随机数数组
    public static int[] generateRandomNumbers(int length) {
        Random random = new Random();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        return numbers;
    }

    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 打印数组
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
