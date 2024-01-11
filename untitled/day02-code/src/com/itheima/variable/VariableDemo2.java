package com.itheima.variable;

public class VariableDemo2 {
    /*
         变量的注意事项   :
                1.变量名不允许重复定义。
                2.一条语句，可以定义出多个变量，中间需要使用逗号分分隔。
                3.变量在使用之前，必须完成赋值 。
                4 TODO :变量的作用域
    */
    public static void main(String[] args) {
        int salary = 12000;
        //1.变量名不允许重复定义。
        //int salary = 15000;
        System.out.println(salary);

        //2.一条语句，可以定义出多个变量，中间需要使用逗号分分隔。
        int a = 10, b = 20, c = 30;

        // 3.变量在使用之前，必须完成赋值
        int num;
        num = 10;
        System.out.println(num);
    }
}
    /*
       标识符命名规则
       由数字、字母、下划线(_)和美元符($)组成
       不能以数字开头
       不能是关键字
       区分大小写



       标识符命名规范
            小驼峰命名法:变量
                规范1:标识符是单词的时候，所有字母小写
                范例:name
                规范2:标识符由多个单词组成的时候，从第二个单词开始。首字母大写
                范例2:firstName

             大驼峰命名法:类
                 规范1:标识符是单词的时候，首字母大写
                 范例1:Student
                 规范2:标识符由多个单词组成的时候，每个单词首字母大写
                 范例2:GoodStudent
    */
