package Thread.Demo;

// 线程的调度
public class PriorityTest {

    public static void main(String[] args) {
        Thread one = new WorkerThread("线程1", Thread.NORM_PRIORITY);
        Thread two = new WorkerThread("线程2", 4);
        Thread three = new WorkerThread("线程3", 8);
        Thread four = new WorkerThread("线程4", Thread.NORM_PRIORITY);

        one.start();
        two.start();
        three.start();
        four.start();
    }
}

class WorkerThread extends Thread {
    private String name;

    public WorkerThread(String name, int priority) {
//        在WorkerThread的构造函数中，根据传入的优先级值来设置线程的优先级，其中会有一个判断条件来确保优先级在有效范围内
        this.name = name;
        if (priority > 10 || priority <= 0) {
            System.out.println("Warning!");
            this.setPriority(Thread.NORM_PRIORITY);
//            将线程的优先级设置为Thread.NORM_PRIORITY
        } else {
            this.setPriority(priority);
        }
    }

    public void run() {
//        首先打印出线程的名称和优先级。然后，通过一个循环来执行一些操作，这里为了简单起见，只是打印出线程名称和正在处理的数字。
        System.out.println(name + "的优先级为" + this.getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "正在打印" + i);
        }
    }
}