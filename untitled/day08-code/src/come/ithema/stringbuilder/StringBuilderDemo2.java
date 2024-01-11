package come.ithema.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo2 {

    /*
            StringBuilder的介绍：

                1、一个可变的字符序列
                2、StringBuilder是字符串缓冲区，将其理解为容器，这个容器可以存储任意数据类型，但是只要进入到这个容器，全部变成字符串。

         StringBuilder的构造方法：

                    public StringBuilder() : 创建一个空白的字符串缓冲区(容器)，其初始容量为16个字符  但是超出时会自动的扩容
                    public StringBuilder(String str) : 创建一个字符串缓冲区(容器)，容器在创建好后，就会带有参数的内容

     */
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder("abc");

        sb.append("123456789123456789");
        System.out.println(sb);
    }




    private static void exam() {
        StringBuilder sb=new StringBuilder();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            sb.append('*');
            System.out.println(sb);
        }
    }
}
