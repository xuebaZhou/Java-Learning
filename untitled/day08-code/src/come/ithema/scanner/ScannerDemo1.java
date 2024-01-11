package come.ithema.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    /*
        Scanner  键盘录入字符串 :

            String next() : 遇到了空格, 或者是 tab键就不再录入了
            String nextLine() : 以回车作为录入的结束标记

            弊端 :
                    1. next() : 数据可能录入不完整
                    2. nextLine() : 之前调用过nextInt(), nextDouble() , nextFloat()...
                                    nextLine()方法，就不干活了

            Scanner : 采集用户信息(只在学习过程中用得到)

            目前的使用方案 :
                             如果要键盘录入字符串
                                    如果所有的数据 , 全部都是字符串，直接nextLine();

     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println(username);

        System.out.println("请输入用户密码:");
        String password = sc.nextLine();
        System.out.println(password);
    }
}
