package come.ithema.string;

public class StringDemo2 {
    /*
            String 类常见构造方法 :
                    public String() : 创建一个空白字符串,里面不含任何内容
                    public String(char[] chs) : 根据传入的字符数组, 创建字符串对象
                    public String(String original) : 根据传入的字符串, 来创建字符串对象

     ---------------------------------------------------------------------------------------

            1. 打印对象名 ,会看到对象的内存地址, 这里打印字符串对象,为何没有看到地址

            Todo : 面向对象(继承) ,方法重写, Object类, toString方法

            2. 这三个构造方法,创建字符串对象,没有双引号直接创建来的方便.


            -----------------------------------------------------------------------

            字符串对象 两种创建方式的区别

                    1. 双引号直接创建
                    2. 通过构造方法创建

     */
    public static void main(String[] args) {
        // public String() : 创建一个空白字符串,里面不含任何内容
        String s1 = new String();
        System.out.println(s1);

        //  public String(char[] chs) : 根据传入的字符数组, 创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs); // 可以将一个字符数组转换为一个字符串
        System.out.println(s2);

        //public String(String original) : 根据传入的字符串, 来创建字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        String ss1 = "abc";
        String ss2 = "a" + "b" + "c"; // 常量优化机制（三个常量做拼接）
        System.out.println(ss1 == ss2);// true

        String sss1="abc";// 记录的是常量池中的地址
        //  字符串底层其实是一个字节类型的数组，byte[] value
        String sss2=new String("abc");// 这条语句创建了两个字符串对象   一个是在堆内存当中有自己独特的内存空间，另一个是在串池当中进行维护
        // 记录的是新new出来的内存空间的地址
        // 每 new 一次，堆内存当中都会有一块新的内存空间
        // String(String original) 初始化新创建的String对象，使其表示与参数相同的字符序列; 换句话说，新创建的字符串是参数字符串的副本。
        System.out.println(sss1==sss2);// false

        String a1="abc";
        String a2="bc";
        String a3=a2+"c";//  这里只要写字符串+进行拼接，一个变量和一个常量做拼接
        // 系统就会自动创建一个StringBuilder对象，但是这里的话StringBuilder与String类型不统一，
        // 会调用里面的toString方法做类型的转换，转换成String类型之后，再把新的地址交给a3
        System.out.println(s1==s3);// false

    }
}
