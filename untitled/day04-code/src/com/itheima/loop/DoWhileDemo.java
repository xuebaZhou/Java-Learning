package com.itheima.loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        doWhileTest();
    }

    /*
        do...while循环格式 :

                初始化语句;
                do{
                    循环体语句;
                    条件控制语句;
                }while(判断条件);


        执行流程:

               1.执行初始化语句
               2.执行循环体语句
               3.执行条件控制语句
               4.执行判断条件，看其返回结果是true，false
                      false  :  循环结束
                      true : 回到第二步继续

     */
    public static void doWhileTest() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("666");
        }

        System.out.println("------------------------");

        int i = 1;
        do {
            System.out.println("666");
            i++;
        } while (i <= 5);

        System.out.println("-------------------");
        //到此处后i=5了，再进行下列语句
        do {
            System.out.println("666");
            i++;
        } while (i <= 5);
    }
}
