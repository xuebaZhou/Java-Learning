package com.itheima.operator;

public class OperatorDemo4 {
    /*
            逻辑运算符 :

                1.用于连接boolean类型的表达式，或者是值
                2.整合多个条件，为一段整体的逻辑

            分类 :

               &(与) : 并且，遇false,则false

                        场景: 范围性的判断查找
                        举例: 键盘录入一个学生成绩，判断该成绩是否在90~100之间
                        伪代码: 不能运行，仅供理解

                        int score = 95;

                        if(score >= 90 & score <= 100){
                        }

               |(或) : 或者，遇true，则true

                        场景: 多个条件任选其一
                        举例: 键盘录入一个学生学号，学号 3 5 12

                        int id = 3;
                        if(id == 3 | id == 5 | id == 12){
                        }
               !(非) : 取反

                        场景: 对一段逻辑整体做取反操作
                        举例: 键盘录入一个学生学号，学号除了  3 5 12 都要

                        if(    !(id == 3 | id == 5 | id == 12)   ){
                        }
               ^(异或) : 相同为false,不同为true.
     */

    //  ture and false 均是boolean类型
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println("--------------------------------------");

        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        System.out.println("--------------------------------------");

        System.out.println(!true);
        System.out.println(!false);

        System.out.println("--------------------------------------");

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

    }
}
