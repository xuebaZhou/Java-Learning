package com.itheima.loop;

public class ForDemo {
    public static void main(String[] args) {
        //forTest1();
        forTest2();
    }

    /*
        for循环语句格式  :

                for(初始化条件;判断条件;条件控制语句){
                    循环控制语句;
                }


         执行流程:
                1. 执行初始化语句，在整个循环过程中，只执行一次。
                2. 执行判断条件，看其返回结果是true，false
                                false : 循环结束
                                true : 执行第三步
                3.  执行循环体语句
                4. 执行条件控制语句
                5.   回到2继续...
     */
    public static void forTest1(){

        for(int i = 1;i <= 3;i++){
            System.out.println("跑圈");
        }
    }


    /*
            for循环注意事项 :
                1. for循环 {} 中定义的变量，在每一轮循环结束后，都会从内存中释放
                2. for循环 () 中定义的变量，在整个循环结束之后，会从内存中释放
                3. for循环 () 与 {}之间不要加分号    "   ;    "
     */
    public static void forTest2(){

        for (int i = 1; i<=5;i++){
            int num =10;
            System.out.println(".....");
        }
    }
}
