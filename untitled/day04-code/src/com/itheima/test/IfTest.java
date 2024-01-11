package com.itheima.test;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        //checkPassword();
        queryPrizeByScore();
    }

    /*
            需求 : 键盘录入用户的密码，如果是123456，程序输出(密码正确),否则输出(密码错误)

            ctrl + alt + l  可以格式化代码
     */
    public static void checkPassword() {
        // 1.准备Scanner键盘录入精灵
        Scanner sc = new Scanner(System.in);
        // 2.指挥精灵从键盘录入密码
        System.out.println("请输入密码:");
        int password = sc.nextInt();
        // 3.使用if语句判断密码是否正确
        if (password == 123456) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误!");
        }
    }

    /*
      需求 : 键盘录入学生的考试成绩，根据成绩所在的区间，打印出不同的奖励

            95~100 : 自行车一辆
            90~94 : 游乐场玩一次
            80~89 : 变形金刚一个
            80分以下 : 挨揍
     */
    public static void queryPrizeByScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的分数:");
        int score = sc.nextInt();
        /*if (score >= 95 && score <= 100) {
            System.out.println("自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80 && score <= 89) {
            System.out.println("变形金刚一个");
        } else if (score >= 0 && score < 80) {
            System.out.println("挨揍");
        } else {
            System.out.println("您的输入有误，请检查输入的分数是否在0~100分之间!");
        }*/

        /*if (score<0||score>100){
            System.out.println("您的输入有误，请检查输入的分数是否在0~100分之间!");
        } else if (score >= 95 && score <= 100) {
            System.out.println("自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80 && score <= 89) {
            System.out.println("变形金刚一个");
        } else  {
            System.out.println("挨揍");
        }*/

        if (score >= 0&& score <= 100) {
            //合理的成绩
            if (score >= 95 && score <= 100) {
                System.out.println("自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一次");
            } else if (score >= 80 && score <= 89) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("挨揍");
            }
        }else {
            //不合理的成绩
            System.out.println("您的输入有误，请检查输入的分数是否在0~100分之间!");
        }
    }


}

