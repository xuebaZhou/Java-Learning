package element;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 创建Scanner对象以获取用户输入
        Scanner sc=new Scanner(System.in);
        // 提示用户输入要输出的斐波那契数列项数
        System.out.print("请输入要输出的斐波那契数列项数：");
        int n = sc.nextInt();
        // 输出斐波那契数列的前 n 项
        System.out.println("斐波那契数列的前 " + n + " 项为：");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    // 计算斐波那契数列的第 n 项
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;  // 这三行代码实现的是核心代码
            }
            return result;
        }
    }
}
