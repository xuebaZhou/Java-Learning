package come.ithema.stringbuilder;
// Ctrl+d 向下复制
public class StringBuilderDemo3 {

    /*
        StringBuilder常用的成员方法：

                    1、public StringBuilder append(任意类型)：向缓冲区里面添加数据，再返回对象自己

                    2、public StringBuilder reverse() : 将缓冲区中的内容，进行反转

                    3、public int length() : 返回长度

                    4、public String toString() : 将缓冲区的内容，以String字符串的类型返回
     */
    public static void main(String[] args) {

       StringBuilder sb=new StringBuilder();

       // 链式编程： 调用的方法，返回的结果是对象，就可以继续向下调用方法
       sb.append("红色").append("绿色").append("蓝色");

       System.out.println(sb);

       // 情况：数据在StringBuilder当中，我要调用的方法，StringBuilder没有，但是String有
       // 解决：转换为String，再调用
       String[] sArr= sb.toString().split("色");

        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }

    }

    private static void exam() {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2 = sb.append("红色");
        StringBuilder sb3 = sb.append("绿色");
        StringBuilder sb4 = sb.append("蓝色");

        // 字符串比对是地址的比对
        System.out.println(sb==sb2);
        System.out.println(sb2==sb3);
        System.out.println(sb3==sb4);
        System.out.println(sb4==sb);
    }
}
