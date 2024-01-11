import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class zaxiang {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input a number:");
        int n=sc.nextInt();
        //singing(n);                                               //调用打印星星的方法
        //System.out.println("The number is:"+fibonacci(n));        //调用递归实现的斐波拉契数列
        //System.out.println("The number is:"+fibonacci2(n));       //调用通过for循环方式实现的斐波拉契数列
        //System.out.println("The number is:"+fibonacci3(n));         //调用通过for循环和数组的方式实现
        yanghui(n);
    }

    // 打印星星的方法
    public static void singing(int n){
        int i,m;
        for(i=1;i<=n;i++) {
            for(m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    //递归实现
    public static int fibonacci(int n) {
        if(n==1||n==2){  // 特殊情况，分开讨论
            return 1;
        }
        if(n>2){
            return fibonacci(n-1)+fibonacci(n-2);// 递归调用
        }
        return -1;  //如果输入错误的n，一律返回-1
    }
    // 通过for循环方式实现
    public static long fibonacci2(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        long a = 1l, b = 1l, c = 0l;        //定义三个long类型整数
        for (int i = 0; i < n - 2; i++) {
            c = a + b;            //第3个数的值等于前两个数的和
            a = b;                //第2个数的值赋值给第1个数
            b = c;                //第3个数的值赋值给第2个数
        }
        return c;                 // 此处提供的类型是long型，所以在定义方法时应该写long而不是int
    }
    // 通过for循环和数组的方式实现
    public static long fibonacci3(int n){
        if(n<1){
            return -1;
        }
        if(n==1||n==2){
            return 1;
        }
        long[] arr=new long[n];      // 数组的动态初始化
        arr[0]=arr[1]=1;            // 第一个和第二个数据特殊处理
        for (int i=2;i<n;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        // 可以得到整个的数列数据 仅n>2
        System.out.println("数组内容："+ Arrays.toString(arr));

        return arr[n-1];
    }
    public static void yanghui(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            // 打印空格字符串
            System.out.format("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
