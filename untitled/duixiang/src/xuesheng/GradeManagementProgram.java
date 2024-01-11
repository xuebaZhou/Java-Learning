package xuesheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GradeManagementProgram {
    private List<Student> students;
    private List<Course> courses;
    private List<Grade> grades;

    public GradeManagementProgram() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double calculateTotalScore(Student student) {
        double totalScore = 0;
        int count = 0;

        for (Grade grade : grades) {
            if (grade.getStudentName().equals(student.getName())) {
                totalScore += grade.getScore();
                count++;
            }
        }

        if (count > 0) {
            return totalScore;
        }

        return 0;
    }

    public double calculateAverageScore(Student student) {
        double totalScore = calculateTotalScore(student);
        int count = 0;

        for (Grade grade : grades) {
            if (grade.getStudentName().equals(student.getName())) {
                count++;
            }
        }

        if (count > 0) {
            return totalScore / count;
        }

        return 0;
    }

    public double calculateTotalCredit() {
        int totalCredit = 0;

        for (Course course : courses) {
            totalCredit += course.getCredit();
        }

        return totalCredit;
    }

    public double calculateClassAverageScore(String className) {
        double totalScore = 0;
        int count = 0;

        for (Grade grade : grades) {
            for (Student student : students) {
                if (student.getClassName().equals(className) && student.getName().equals(grade.getStudentName())) {
                    totalScore += grade.getScore();
                    count++;
                    break;
                }
            }
        }

        if (count > 0) {
            return totalScore / count;
        }

        return 0;
    }

    public List<Student> sortByAverageScoreDesc() {
        List<Student> sortedStudents = new ArrayList<>(students);

        Collections.sort(sortedStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                double averageScore1 = calculateAverageScore(s1);
                double averageScore2 = calculateAverageScore(s2);

                if (averageScore1 > averageScore2) {
                    return -1;
                } else if (averageScore1 < averageScore2) {
                    return 1;
                }

                return 0;
            }
        });

        return sortedStudents;
    }

    public double calculateCourseAverageScore(String courseName) {
        double totalScore = 0;
        int count = 0;

        for (Grade grade : grades) {
            if (grade.getCourseName().equals(courseName)) {
                totalScore += grade.getScore();
                count++;
            }
        }

        if (count > 0) {
            return totalScore / count;
        }

        return 0;
    }

    public static void main(String[] args) {
        GradeManagementProgram program = new GradeManagementProgram();

        // 添加学生
        program.addStudent(new Student("张三", 1, "男", "一班"));
        program.addStudent(new Student("李四", 2, "女", "一班"));
        program.addStudent(new Student("王五", 3, "男", "二班"));

        // 添加课程
        program.addCourse(new Course(1, "数学", 4));
        program.addCourse(new Course(2, "英语", 3));
        program.addCourse(new Course(3, "物理", 3));

        // 添加成绩
        program.addGrade(new Grade("张三", "数学", 90));
        program.addGrade(new Grade("张三", "英语", 85));
        program.addGrade(new Grade("张三", "物理", 80));
        program.addGrade(new Grade("李四", "数学", 95));
        program.addGrade(new Grade("李四", "英语", 90));
        program.addGrade(new Grade("李四", "物理", 85));
        program.addGrade(new Grade("王五", "数学", 80));
        program.addGrade(new Grade("王五", "英语", 75));
        program.addGrade(new Grade("王五", "物理", 70));

        // 计算每个学生的总成绩和平均成绩
        for (Student student : program.students) {
            double totalScore = program.calculateTotalScore(student);
            double averageScore = program.calculateAverageScore(student);
            System.out.println("学生 " + student.getName() + " 的总成绩是 " + totalScore + "，平均成绩是 " + averageScore);
        }

        // 计算总学分
        double totalCredit = program.calculateTotalCredit();
        System.out.println("总学分是 " + totalCredit);

        // 计算每个班级的平均成绩
        System.out.println("一班的平均成绩是 " + program.calculateClassAverageScore("一班"));
        System.out.println("二班的平均成绩是 " + program.calculateClassAverageScore("二班"));

        // 按照学生平均成绩由高到低进行排序
        List<Student> sortedStudents = program.sortByAverageScoreDesc();
        System.out.println("按照学生平均成绩由高到低的顺序排序：");
        for (Student student : sortedStudents) {
            System.out.println("学生 " + student.getName() + " 的平均成绩是 " + program.calculateAverageScore(student));
        }

        // 统计所有学生每门课程的平均成绩
        for (Course course : program.courses) {
            double averageScore = program.calculateCourseAverageScore(course.getCourseName());
            System.out.println("课程 " + course.getCourseName() + " 的平均成绩是 " + averageScore);
        }
    }
}