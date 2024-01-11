package come.ithema.test;

import java.util.Scanner;

public class StringTest3 {
    /*
       需求：以字符串的形式从键盘接受一个手机号，将中间的四位号码屏蔽；
                        最终效果：156****1234

       分析:
                1.键盘录入字符串.
                2.截取前三位
                3.截取后四位
                4.前三位+"****" +后四位
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个号码：");
        String num = sc.nextLine();

        String result1 = num.substring(0, 3);
        // String result2 = num.substring(7, 11);
        String result3 = num.substring(7);
        System.out.println(result1 + "****" + result3);
    }
}
