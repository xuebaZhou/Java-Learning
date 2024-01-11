package com.itheima.control;


import java.util.Scanner;

public class BreakDemo {
    /*
              break : 结束循环，结束switch语句

             注意事项 : 只能在循环，或者是switch语句中进行使用
     */
    public static void main(String[] args) {
        login();
    }// 主方法，这是代码执行的入口
    /*
            模拟用户登录，给三次机会，密码假设为123456:
     */

    public static void login() {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入密码:");
            int password = sc.nextInt();

            if (password == 123456) {
                System.out.println("登录成功!");
                break;
            } else if (i == 3) {
                System.out.println("登录失败，密码有误!");
                System.out.println("请于30min后在进行输入");
            } else {
                System.out.println("登录失败，密码有误，请重试：");
            }
        }
    }

}
