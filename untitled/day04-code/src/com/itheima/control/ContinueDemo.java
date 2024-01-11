package com.itheima.control;

public class ContinueDemo {
    /*
        continue : 跳过本次循环，开始下一次的循环。

        注意事项 : continue只能在循环中使用

        ----------------------------------------
        break ,continue 的共同注意事项:

                    下面不允许写代码，因为执行不到，属于无效代码
     */
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        for (int i = 0; i <= 80; i++) {
            if (i % 3 == 1 || i == 7 || i % 14 == 0) {
                continue;
            }
            System.out.println("第" + i + "名顾客持48小时核酸证明进入电影院...");
        }
    }
}
