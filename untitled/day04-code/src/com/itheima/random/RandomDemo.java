package com.itheima.random;

//1.找符咒

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        randomTest();
    }

    /*
            Random产生随机数
     */
    public static void randomTest() {
        //2.召唤精灵
        Random r = new Random();

        for (int i = 1; i <= 20; i++) {
            //3.指挥精灵产生随机数
            int num = r.nextInt(100) + 1;
            System.out.println(num);
        }

        System.out.println("---------------------------");

        //产生20~80之间的随机数
        for (int i = 1; i <= 20; i++) {
            int num = r.nextInt(51) + 20;
            System.out.println(num);
        }
    }
}
