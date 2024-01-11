package com.itheima.mswitch;

import java.util.Scanner;

//if语句   适用于范围性的判断。
//switch   适用于固定值的匹配。
public class SwitchDemo {
    public static void main(String[] args) {
        //switchTest1();
        //switchTest2();
        switchTest3();
    }

    /*
        switch语句格式  :

            switch(将要匹配的值){
                case 值1 :
                    语句体1 ;
                    break;
                case 值2 :
                    语句体2 ;
                    break;
                case 值3 :
                    语句体3 ;
                    break;
               ...
                 default:
                    语句体n+1 ;
                    break;
            }
        执行流程:

                1.拿着()中将要匹配的值，与case给出的选项，逐个进行匹配
                        匹配成功，执行对应的语句体，再由break结束整个的switch语句
                2.如果给出的所有case，都匹配失败了，将会执行最后的 default ，由break结束掉整个的switch语句

          需求 : 键盘录入一个整数，根据录入的数值。程序打印出对应的星期

                        1  --->  星期一
                        2  --->  星期二
                        ...
                        7  --->  星期日
                        8  --->  您的输入有误
     */
    public static void switchTest1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int week = sc.nextInt();

        switch (week){
            case 1 :
                System.out.println("星期一");
                break;
            case 2 :
                System.out.println("星期二");
                break;
            case 3 :
                System.out.println("星期三");
                break;
            case 4 :
                System.out.println("星期四");
                break;
            case 5 :
                System.out.println("星期五");
                break;
            case 6 :
                System.out.println("星期六");
                break;
            case 7 :
                System.out.println("星期日");
                break;
            default:
                System.out.println("您的输入有误!");
                break;
        }
    }

    /*
        switch语句注意事项  :

                1. case 后面的值不允许重复
                2. case 后面的值，只能是字面量，不能是变量
                3. switch()中可以接收的类型

                            1).基本数据类型:byte  short  char  int
                            2).引用数据类型:jdk5版本开始可以是枚举，jdk7版本开始可以是String字符串

                4.case穿透现象
     */
    public static void switchTest2(){
        int week = 1;
        String num ="1\5";

        switch (num){
            case "1" :
                System.out.println("11");
                break;
            case "2":
                System.out.println("22");
                break;
            case "3" :
                System.out.println("33");
                break;
            case "4" :
                System.out.println("44");
                break;
            default:
                System.out.println(666);
        }
    }

    /*
            switch语句的穿透现象


            需求:键盘录入一个数值，1~5 : 输出工作日  6~7 : 输出休息日

            现象 : 多个case中存在了重复的代码，考虑使用case穿透来优化代码
     */
    public static void switchTest3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int week = sc.nextInt();

        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("您的输入有误！");
                break;
        }
    }

    /*
                jdk14版本开始，case后面允许编写多个数据，多个数据后面使用逗号分隔
            */
    public static void switchTest4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int week = sc.nextInt();

        switch(week){
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("您的输入有误！");
                break;
        }
    }

    public static void switchTest5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int week = sc.nextInt();

        switch(week){
            case 1,2,3,4,5-> System.out.println("工作日");
            case 6,7-> System.out.println("休息日");
            default-> System.out.println("您的输入有误！");
        }
    }
}
