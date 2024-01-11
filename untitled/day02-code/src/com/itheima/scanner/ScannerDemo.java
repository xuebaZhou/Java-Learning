package com.itheima.scanner;
//这一条代码在创建包时会自动写入，说明这个ScannerDemo类归属于scanner这个包。但不能删除它！

// 导包 : 导入包中的类文件

import java.util.Scanner;

public class ScannerDemo {
    /*
        Scanner键盘录入的三个步骤

        1.找符咒
                        代码:import java.util.Scanner;
                        位置:class的上面
                        含义:能够让自己的类ScannerDemo,从代码仓库中，找到Scanner符咒
        2.召唤精灵
                        代码:Scanner sc = new Scanner(System.in);
                        位置:main方法里面
                        含义:从符咒中召唤精灵，给精灵起名字叫做  sc
        3.指挥精灵干活

                        代码:
                                     int age = sc.nextInt();                从键盘录入整数，并使用int类型变量接收
                                     double height = sc.nextDouble();       从键盘录入小数，并使用double类型变量接收
                                     boolean flag = sc.nextBoolean();       从键盘录入布尔，并使用类型boolean变量接收
                                     String name = sc.next();               从键盘录入字符串，并使用String类型变量接收
    */
    public static void main(String[] args) {                  //从键盘中录入一个整数，并打印到控制台。
        //  召唤精灵 : 给精灵起名字叫二狗   （可以起中文名，也可以起英文名）
        Scanner 二狗 = new Scanner(System.in);

        //  指挥精灵干活
        int age = 二狗.nextInt();

        System.out.println(age);


        Scanner scan = new Scanner(System.in);
        // next方式接收字符串
        System.out.println("next的接收方式：");
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据：" + str1);
        }

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        if(scan.hasNextLine()){
            String str2=scan.nextLine();
            System.out.println("输入的数据为："+str2);
        }

        //在输入之前最好先使用 hasNextXxx() 方法进行验证，再使用 nextXxx() 来读取
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
//        next() 与 nextLine() 区别
//        next():
//
//        1、一定要读取到有效字符后才可以结束输入。
//        2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
//        3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
//        next() 不能得到带有空格的字符串。
//        nextLine()：
//
//        1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
//        2、可以获得空白。

    }

}



