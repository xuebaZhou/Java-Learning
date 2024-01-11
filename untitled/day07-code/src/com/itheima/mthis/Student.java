package com.itheima.mthis;

public class Student {
    String name;

    public void sayHello(String name) {
        System.out.println(name);               //     西域狂鸭
        System.out.println(this.name);          //     钢门吹雪
        this.method();
    }

    public void method() {
        System.out.println("method...");
    }

    public void print() {
        System.out.println("print方法中打印this关键字   ----->" + this);
    }
}
