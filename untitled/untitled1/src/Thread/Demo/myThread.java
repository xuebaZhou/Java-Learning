package Thread.Demo;

// 创建线程方法一:继承Thread类
public class myThread {
    //  定义线程对象
    static ThreadClass1 threadObj1;
    static ThreadClass2 threadObj2;

    public static void main(String[] args) {
//        线程实例化
        threadObj1 = new ThreadClass1();
        threadObj2 = new ThreadClass2();
//        启动线程对象
        threadObj1.start();
        threadObj2.start();
    }
}

// 线程类1
class ThreadClass1 extends Thread {
    //    线程体
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("you are Student!");
            try {
                sleep(300);
//                使线程休眠300毫秒
            } catch (InterruptedException e) {
            }
        }
    }
}

//线程类2
class ThreadClass2 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("I am a teacher!");
            try {
                sleep(600);
//                使线程休眠600毫秒
            } catch (InterruptedException e) {
            }
        }
    }
}