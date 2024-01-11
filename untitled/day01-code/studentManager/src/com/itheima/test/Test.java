package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // 增删改查都是围绕着这个进行操作
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------欢迎来到学生管理系统---------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteStudentById(list);
                    break;
                case 3:
                    updateStudentInfoById(list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见");
                    System.exit(0);           // 终止正在运行的JVM虚拟机
                    break;
                default:
                    System.out.println("您的输入有误，请检查");
                    break;
            }
        }
    }

    /**
     * 此方法用于键盘录入学生信息，封装为学生对象，存入集合
     */
    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号:");

        String id="";
        while (true) {
            id = sc.next();
            int index = getIndex(id, list);
            if (index == -1) {
                // 学号在集合中不存在，可以使用!
                break;
            } else {
                System.out.println("您输入的学号已被占用，请重新输入!");
            }
        }
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();

        Student stu = new Student(id, name, age, birthday);

        list.add(stu);
        System.out.println("添加成功!");
    }

    /**
     * 根据学号修改集合中的学生信息
     */
    private static void updateStudentInfoById(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号:");
        String updateId = sc.next();
        int index = getIndex(updateId, list);
        if (index == -1) {
            System.out.println("查无此人，修改失败!");
        } else {
            System.out.println("请输入新的学生姓名:");
            String name = sc.next();
            System.out.println("请输入新的学生年龄:");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日:");
            String birthday = sc.next();

            // 将新录入的学生信息，封装为学生对象
            Student stu = new Student(updateId, name, age, birthday);

            list.set(index, stu);

            System.out.println("修改成功!");
        }
    }

    /**
     * 根据学号删除集合中的学生
     */
    private static void deleteStudentById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号:");
        String id = sc.next();
        int index = getIndex(id, list);
        if (index == -1) {
            System.out.println("查无此人，删除失败!");
        } else {
            list.remove(index);
            System.out.println("删除成功!");
        }
    }

    /**
     * 此方法用于查看学生
     */
    private static void queryStudentInfos(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("查无信息，请添加后重试!");
        } else {
            System.out.println("学号\t\t\t姓名\t年龄\t生日");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
            }
        }
    }

    /**
     * 此方法根据学号，去集合中查找对应的索引
     */
    private static int getIndex(String id, ArrayList<Student> list) {
        // 遍历集合，获取到每一个集合对象
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
//            stu.getId() : 从集合中取出的学生学号
//            id: 要查找的学号
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
