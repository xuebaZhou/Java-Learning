package Thread.Demo;

import java.util.ArrayList;
import java.util.List;

// 运行结果在大多数情况下都是不确定的。由于线程ta、tb和tc共享同一个ThreadSynch实例t2，它们在并发执行add方法时会涉及到对共享list的操作，因此可能产生竞态条件。
//
//在add方法中，虽然使用了synchronized关键字进行同步，但是由于在多个线程中共享了同一个ThreadSynch实例t2，导致了多个线程可以同时访问共享资源list，可能会产生不确定的结果。
//
//具体来说，由于每个线程执行add方法时都会向list中添加元素，而添加元素的过程并不是原子操作，所以可能出现数据竞争的情况，导致最终的运行结果不确定。另外，线程间的调度也会影响最终的输出结果。
public class ThreadSynchDemo {

    public static void main(String[] args) throws InterruptedException{
        ThreadSynch t1=new ThreadSynch();
        ThreadSynch t2=new ThreadSynch();
//        Thread(Runnable target, String name)：在第一种形式的基础上，增加了一个String类型的参数，用于指定线程的名称。
        Thread ta=new Thread( t1,"A");
        Thread tb=new Thread( t2,"B");
        Thread tc=new Thread( t2,"C");
        ta.start();
        tb.start();
        tc.start();

        ta.join();
        tb.join();
        tc.join();
        System.out.println(ThreadSynch.list);
    }
}

// 定义一个实现了Runnable接口的类ThreadSynch
class ThreadSynch implements Runnable {
    // 静态的List，所有线程共享
    static List<String> list = new ArrayList<>();

    // 添加元素到list的方法，使用synchronized关键字进行同步
    public synchronized void add() throws InterruptedException {
        String name = Thread.currentThread().getName(); // 获取当前线程的名称
        for (int i = 0; i < 5; i++) {
            list.add(name); // 将当前线程的名称添加到list中
            Thread.sleep(200); // 线程休眠200毫秒
        }
    }

    // 实现Runnable接口的run方法
    public void run() {
        try {
            add(); // 在run方法中调用add方法向list添加元素
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


