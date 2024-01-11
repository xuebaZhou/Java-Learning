package Questions.chapter4;

import java.util.Vector;

public class Student {
    private String name;
    private int number;
    private String sex;
    private String team;

    public Student(String name, int number, String sex, String team) {
        this.name = name;
        this.number = number;
        this.sex = sex;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getSex() {
        return sex;
    }

    public String getTeam() {
        return team;
    }

    public static void main(String[] args) {
        Vector<Student> students = new Vector<>();

        // 创建五个学生对象并添加到向量中
        students.add(new Student("王还红", 120410107, "女", "1204101"));
        students.add(new Student("杨冰", 120410115, "男", "1204101"));
        students.add(new Student("李真骁", 120410211, "男", "1204102"));
        students.add(new Student("刘玉坤", 120410315, "男", "1204103"));
        students.add(new Student("王珊珊", 120410403, "女", "1204104"));

        // 输出性别为"男"的学生对象信息
        System.out.println("性别为\"男\"的学生信息：");
        for (Student student : students) {
            if (student.getSex().equals("男")) {
                System.out.println("学号：" + student.getNumber());
                System.out.println("姓名：" + student.getName());
                System.out.println("性别：" + student.getSex());
                System.out.println("班级：" + student.getTeam());
                System.out.println();
            }
        }
    }

}


