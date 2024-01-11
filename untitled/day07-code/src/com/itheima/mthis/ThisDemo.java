package com.itheima.mthis;

public class ThisDemo {
    /*
            成员变量和局部变量重名的情况下,Java使用就近原则


            可使用 this 关键字进行区分

            this可以解决成员变量与局部变量重名问题。

       -----------------------------------------------------

       this关键字的作用 :

                    this 可以调用本类成员 (变量,方法)

                            this.本类成员变量
                            this.本类成员方法();


         this. 的省略规则 :

                本类成员方法 : 没有前提条件, this.可以省略
                本类成员变量 : 方法中没有出现重名的变量,this.才可以省略

           this介绍 : 代表当前类对象的引用(地址)
                           - 谁来调用我,我就代表谁.

                           - 哪一个对象调用方法,方法中的this,代表的就是哪一个对象.

     */
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "钢门吹雪";
        stu.sayHello("西域狂鸭");
        System.out.println("----------------------------");

        Student stu1 = new Student();
        System.out.println(stu1);
        stu1.print();
        System.out.println("----------------------------");

        Student stu2 = new Student();
        System.out.println(stu2);
        stu2.print();


    }
}
