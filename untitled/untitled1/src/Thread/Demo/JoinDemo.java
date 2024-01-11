package Thread.Demo;

//主线程
public class JoinDemo {
    static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        int arr[] = new int[10];
        Thread producer = new Thread(new Producer(arr));
        producer.start();
        Thread worker = new Thread(new Worker(arr, producer));
        worker.start();
        Thread printTask = new Thread(new PrintTask(worker));
        printTask.start();
        printTask.join();
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        if (sum == sum1) {
            System.out.println("验证通过！");
        } else {
            System.out.println("验证失败！" + "sum=" + sum + ", sum1=" + sum1);
        }
    }
}

// 线程1
class Producer implements Runnable {
//    实现了Runnable接口
    int[] arr;

//   构造函数
    public Producer(int[] arr) {
        this.arr = arr;
    }
// Producer类实现了Runnable接口，因此需要实现run方法。
    public void run() {
        System.out.println("初始化...");
        for (int i = 0; i < arr.length; i++) {
//            Math.random()方法生成一个0到1之间的随机数，并将其乘以100，转换为一个0到100之间的整数
            arr[i] = (int) (Math.random() * 100);
            if(i<arr.length-1){
            System.out.print(arr[i] + ", ");}
            else {
                System.out.print(arr[i]);
            }
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}

//线程2
class Worker implements Runnable {
    int[] arr;          // 加不加 private 都是可以的
    Thread thread;

    public Worker(int[] arr, Thread thread) {
        this.arr = arr;
        this.thread = thread;
    }

    public void run() {
        try {
//            join方法会让当前线程（即Worker对象所在的线程）等待thread线程的终止。
//            这意味着在thread线程执行完毕之前，Worker线程会一直阻塞在这里。
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始计算...");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        JoinDemo.sum = sum;
    }
}

//线程3
class PrintTask implements Runnable {
    Thread thread;

    public PrintTask(Thread thread) {
        this.thread = thread;
    }

    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sum=" + JoinDemo.sum);
    }
}


