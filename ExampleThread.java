package ExamTest2.Selection;

public class ExampleThread {
  private final Object lock = new Object();

  public void doSomething() {
    synchronized (lock) {
      // 一些操作...
      System.out.println("当前线程执行到唤醒其他线程的代码...");
      lock.notify(); // 唤醒在此对象上等待的某个线程
      System.out.println("当前线程已经完成了唤醒其他线程的操作...");
    }
  }

  public static void main(String[] args) {
    ExampleThread example = new ExampleThread();
    Thread thread1 =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                example.doSomething();
              }
            });
    Thread thread2 =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  example.lock.wait(); // 在此处等待，直到被唤醒
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                System.out.println("被唤醒的线程执行了操作...");
              }
            });
    thread1.start(); // 启动第一个线程执行doSomething方法
    thread2.start(); // 启动第二个线程等待唤醒
  }
}
