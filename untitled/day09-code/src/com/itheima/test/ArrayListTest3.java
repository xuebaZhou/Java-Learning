package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    /*
     创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

                    学生的姓名和年龄均来自于键盘录入
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            // System.out.println("Please input "+i+" the information of the Student:");
            addStudent(list);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "        " + stu.getAge());
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
//        键盘录入的学生信息，封装为学生对象
        Student stu = new Student(name, age);
//        将封装好的学生对象，存入集合
        list.add(stu);
    }
}
