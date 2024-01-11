package come.ithema.test;

import java.util.Scanner;
/*
         键盘录入一个字符串,统计该字符串中大写，小写，数字出现的次数(不考虑其他字符)
 */

public class  StringTest2 {

    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        // 2.定义三份计数器变量,用于统计操作
        int daxie = 0, xiaoxie = 0, shuzi = 0;

        char[] chars = s.toCharArray();
        // 3. 遍历字符串,获取到每一个字符
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            //4.在遍历的过程中,加入if判断,看字符属于哪一种类型
            if (c >= 'A' && c <= 'Z') {
                // 5. 对应的计数器变量自增
                daxie++;
            } else if (c >= 'a' && c <= 'z') {
                xiaoxie++;
            } else if (c >= '0' && c <= '9') {
                shuzi++;
            }
        }
        // 6. 在遍历结束后，将统计好的计数器变量,打印在控制台
        System.out.println("大写字母个数为:" + daxie);
        System.out.println("小写字母个数为:" + xiaoxie);
        System.out.println("数字个数为:" + shuzi);

        //System.out.println(Math.abs(-4.9999));
    }
}
