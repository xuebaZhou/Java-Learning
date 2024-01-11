package Thread.Demo;

//  创建线程的方法二：实现Runnable接口

public class MyThread1 {
    //  定义线程对象
    static Thread threadObjectA;
    static Thread threadObjectB;

    public static void main(String[] args) {
//        用线程接口实现类创建对象
        Runnable targetA = new ThreadInterfaceImp1A();
        Runnable targetB = new ThreadInterfaceImp1B();
//        实例化Thread类对象
        threadObjectA = new Thread(targetA);
        threadObjectB = new Thread(targetB);
//        启动线程
        threadObjectA.start();
        threadObjectB.start();
    }
}

//  定义一个实现Runnable接口的实现类，在类中一定要实现run()。
//  Runnable接口实现类A
class ThreadInterfaceImp1A implements Runnable {
    //    线程体
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("you are a Student!");
//            try {
//                Thread.sleep(300);
////                使线程休眠300毫秒
//            } catch (InterruptedException e) {
//            }
        }
    }
}

// Runnable接口实现类B
class ThreadInterfaceImp1B implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("I am a teacher!");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//            }
        }
    }
}
