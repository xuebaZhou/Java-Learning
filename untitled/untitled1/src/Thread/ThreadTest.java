package Thread;

public class ThreadTest {
    public static void main(String[] args) {
        mythread t1=new mythread();

        t1.start();

        mythread t2=new mythread();
        t2.start();

        for (int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i+"**********main()***********");
            }
        }

    }
}
