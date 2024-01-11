package com.itheima.test;

public class ForTest {
    public static void main(String[] args) {
        print(10);
        System.out.println("----------------------------");
        print(0);
        printNumber();
        System.out.println("----------------------------");
//        int result = getSum();
//        System.out.println("1~100的偶数和为:" + result);
        //  生成方法返回值的快捷键 :
        //  1.方法名().var + 回车
        //  2. ctrl + alt +v
        int sum = getSum1();
        System.out.println(sum);
        System.out.println("-------------------------------");
        daffodilNumber();
        System.out.println("----------------------------------");
        int i = daffodilCount();
        System.out.println("水仙花的个数为:" + i);
        System.out.println("-----------------------------");
        printRectangle();
        printTriangle();
        System.out.println("-----------------------------");
        print99();
    }

    /*
           需求 :在控制台用 *  打印4行5列的矩形
            System.out.print();             打印数据后，换行没有效果
            System.out.println();           打印数据后，换行有效果
     */
    public static void printRectangle() {

        //外循环: 控制行数
        for (int i = 1; i <= 4; i++) {
            //内循环: 控制列数
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
          需求 :在控制台用 *  打印5行的直角三角形

                 *
                 **
                 ***
                 ****
                 *****
     */
    public static void printTriangle() {
        //  外循环
        for (int i = 1; i <= 5; i++) {
            //     内循环
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
        //  外循环
        for (int i = 1; i <= 5; i++) {
            //     内循环
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        //  外循环
        for (int i = 5; i >= 1; i--) {
            //     内循环
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        打印九九乘法表
     */
    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " \t");
            }
            System.out.println();
        }
    }


    public static void print(int n) {

        if (n < 1) {
            System.out.println("您传入的参数有误，请检查!");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println("黑马程序员");
            }
        }
    }

    /*
                在控制台打印数字 1~3    积累思路:循环中控制循环的那个变量,可以在循环体中,继续使用的
                在控制台打印数字 3~1    积累思路:循环的条件控制语句,不要局限的认为,只能是--
     */
    public static void printNumber() {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /*
            需求: 求1~100 之间的偶数和，并把求和结果打印在控制台
     */
    public static int getSum() {
        //1.定义求和变量，准备记录累加的结果
        int sum = 0;
        //2.通过for循环，获取1~100之间的每一个数据
        for (int i = 1; i <= 100; i++) {
            //i : 1~100 之间的每一个数据
            //3. 在循环中加入if判断，筛选出偶数
            if (i % 2 == 0) {
                //4. 累加求和
                sum += i;
            }
        }
        //5.在循环结束后，将求和结果打印在控制台
        return sum;
    }

    public static int getSum1() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    /*
        需求: 在控制台输出所有的水仙花数
        规则:
                1. 水仙花是一个三位数
                2.水仙花数的个位、十位、百位的数字立方和等于原数
    */
    public static void daffodilNumber() {
        // 1.获取到所有的三位数
        for (int i = 100; i <= 999; i++) {
            //2.将每一个三位数，拆分出个位、十位、百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //3. 判断
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                //4.打印水仙花数
                System.out.println(i);
            }
        }


    }

    /*
             统计水仙花的个数
     */
    public static int daffodilCount() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
                count++;
            }
        }
        return count;

    }
}