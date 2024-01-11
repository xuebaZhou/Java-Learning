package com.itheima.test;
/*
        方法的常见问题

        1.方法不调用就不执行。
        2.方法与方法之间是平级关系，不能嵌套定义。
        3.方法的编写顺序和执行顺序无关。
        4.方法的返回值类型为void。表示该方法没有返回值，没有返回值的方法可以省略return语句不写，
          如果要编写return，后面不能跟具体的数据
        5.return语句下面,不能编写代码，因为永远执行不到,属于无效的代码。
 */
public class MethodTest {
    public static void main(String[] args) {

        System.out.println("开始");
        getMax(10,20);
        getMax(100,20);
        int result =max(15,30);
        System.out.println(result);
        System.out.println("结束");
    }
    //需求: 定义一个方法，方法中定义出两个整数变量，求出最大值并打印在控制台。
    public static void getMax(int num1 , int num2){
//        int num1 = 10;
//        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;

        System.out.println(max);
    }
    public static int max(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }
    /*
    定义方法时，要做到两个明确
        1.明确参数:主要是明确参数的类型和数量。
        2.明确返回值类型:主要是明确方法操作完毕之后是否有结果数据,如果有,写对应的数据类型，如果没有,写void.


    调用方法时
       void类型的方法,直接调用即可
       非void类型的方法,推荐用变量接收调用。
     */
}
