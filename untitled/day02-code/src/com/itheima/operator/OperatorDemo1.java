package com.itheima.operator;

public class OperatorDemo1 {
    /*
            算术运算符 :
            +   -   *      这三个与现实中一样。
    ---------------------------------------------------------
                /   :整数相除，结果只能得到整数，想要得到带有小数的结果，需要有小数参与运算
                %   :取模， 作用是用来取余数的

                问题: 这玩意有啥用啊?
                回答:% 目前能够想到的场景， 可以进行奇偶数的判断
                                        - 任何一个数 % 2 的结果，不是0，就是1
   */
    public static void main(String[] args) {
        System.out.println(10+20);                  //结果为30
        System.out.println(10-20);                  //结果为-10
        System.out.println(10*20);                  //结果为200
        System.out.println(5/2);                    //结果为  2
        System.out.println(5.0/2);                  //结果为  2.5
        System.out.println(5/2.0);                  //结果为  2.5
        System.out.println(5.0/2.0);                //结果为  2.5

        System.out.println("------------------------------------");

        System.out.println(5%2);                    // 5 / 2 = 2...1
        System.out.println(4%2);                    // 4 / 2 = 2...0
        System.out.println(3%2);                    //1
        System.out.println(2%2);                    //0
    }
}
