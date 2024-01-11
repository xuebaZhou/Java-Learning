package com.itheima.demo;

import java.util.Random;

public class RandomDemo {
    /*
        从数组中随机取出一个元素

                根据数组的长度,产生一个随机数,拿着这个随机数,当做索引去数组中获取元素
     */
    public static void main(String[] args) {
        String[] sArr = {"米饭", "馒头", "包子", "麻花", "面条"};
                         //0       1      2      3       4

        Random r = new Random();

        int i = r.nextInt(sArr.length);

        System.out.println(i);

        System.out.println(sArr[i]);
    }
}
