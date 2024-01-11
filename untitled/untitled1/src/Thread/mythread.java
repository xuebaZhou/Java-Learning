package Thread;

//https://blog.csdn.net/weixin_43824267/article/details/112706385
public class mythread extends Thread{
     public void run(){
         for (int i=0;i<100;i++){
             if(i%2==0){
                 System.out.println(Thread.currentThread().getName()+":"+i);
             }
         }
     }
}

