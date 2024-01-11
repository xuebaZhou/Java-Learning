package come.ithema.test;

import java.util.Scanner;

public class StringTest1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 定义两个字符串变量,模拟已经存在的用户名和密码
        String username = "admin";
        String password = "123456";

        for (int i = 1; i <= 3; i++) {
            // 2.  键盘录入用户输入的用户名,密码
            System.out.println("请输入用户名:");
            String inputUsername = sc.nextLine();
            // 如果录入的数据全部都是字符串，则直接nextLine没有影响的

            System.out.println("请输入密码:");
            String inputPassword = sc.nextLine();

            // 3. 比对
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("登录成功!");
                break;
            } else {

                if (i == 3) {
                    System.out.println("请明天再试!");
                } else {
                    System.out.println("登录失败,您还剩余" + (3 - i) + "次机会");
                }
            }
        }
    }
}
