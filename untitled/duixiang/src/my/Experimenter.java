package my;

public class Experimenter extends Person {
    String code;
    String major;

    public Experimenter() {
    }// 带参数构造方法(两个参数)

    public Experimenter(String code, String major) {
        // 隐含调用父类中的默认构造方法
        this.code = code;
        this.major = major;
    }

    // 带参数构造方法(三个参数)
    public Experimenter(String name, char gender, int age, String code, String major) {
        super(name, gender, age);     // 调用父类中的带参数的构造方法
        this.code = code;
        this.major = major;
    }

    //输出子类对象的成员变量值
    public void print() {
        System.out.println("子类对象" + name + ",” + " +
                gender + "," + code + "," + major);
    }

    public void printSuper() {
        System.out.println("父类对象:" + super.name + "," +
                super.gender + "," + super.getAge());
    }

    //修改父类对象成员变量的值
    public void setSuper(String name) {
        super.name = name;
    }

    public static void main(String[] args) {
        Experimenter exper1 = new Experimenter();
        Experimenter exper2 = new Experimenter("000011", "服务科学与工程");
        Experimenter exper3 = new Experimenter("王二", '男', 20, "000012", "软件工程");
        exper1.print(); //输出子类对象exper1的成员变量值
        exper2.print(); //输出子类对象exper2的成员变量值
        exper3.printSuper(); //输出子类对象exper3的父类对象成员变量值
        exper3.print(); //输出子类对象exper3的成员变量值
        exper3.setSuper("李四");//修改子类对象exper3的父类对象的成员变量值
        exper3.print(); //重新输出子类对象exper3的成员变量值
    }
}



