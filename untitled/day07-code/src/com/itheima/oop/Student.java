package com.itheima.oop;

    /*
        前提须知 : Java当中想要创建对象,必须先有类的存在

        类 : 一组相关属性和行为的集合,将其看做为是对象的设计图。
        对象 : 是根据设计图(类),创建出来的实体

        类和对象的关系 :

                1) 依赖关系: 需要根据类, 创建对象
                2) 数量关系: 根据一个类, 可以创建出多个对象

        类的组成:

                类的本质 : 就是对事物进行描述

                属性(名词): 在代码中使用成员变量表示,成员变量跟之前定义变量的格式一样,只不过位置发生了变化,类中方法外.

                行为(动词): 在代码中使用成员方法表示,成员方法跟之前定义方法的格式一样,只不过需要去掉 static 关键字
     */
    public class Student {  //在编写类的时候,一般不会给成员变量进行赋值,等具体对象创建完成之后,在进行赋值。
        // 属性 : 姓名, 年龄
        String name;
        int age;
        // 行为: 学习,吃饭
        public void study() {
            System.out.println("学生学习...");
        }
        public void eat() {
            System.out.println("学生吃饭...");
        }
    }
