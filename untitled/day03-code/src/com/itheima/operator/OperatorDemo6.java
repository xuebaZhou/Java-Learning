package com.itheima.operator;

public class OperatorDemo6 {
    /*
                三元运算符 (三目运算符)

                    格式 :
                            判断条件 ? 值1 : 值2;

                    执行流程
                            1. 执行判断条件，看其返回结果是true还是false
                            2. true : 值1就是最终结果
                            3. false : 值2就是最终结果

                      总结 : 根据条件判断，从两份数据中二者选其一

     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;

        System.out.println(max);

    }
}
