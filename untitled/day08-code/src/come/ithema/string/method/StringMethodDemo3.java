package come.ithema.string.method;

public class StringMethodDemo3 {
    /*
       String类的截取方法 ：

                public String substring(int beginIndex): 根据传入的索引开始做截取，截取到字符串的末尾
                public String substring(int beginIndex , int endIndex):根据传入的开始和结束索引，对字符串做截取
                                                                                    - 包含头，不包含尾

                注意：截取出来的内容，是作为新的字符串返回，别忘记找变量接收

     */

    public static void main(String[] args) {
        // method();
        String s ="itheima";
        // s.substring(0,1);  这句话没有进行接收，还是输出原来的字符串
        String result1 = s.substring(0, 2);

        System.out.println(result1);
    }

    private static void method() {
        String s="itheima";
        //s.substring(2);    这个方法的话，有一个返回值，但是调用方法的话，在这里没有进行接收
        // String字符串一旦被创建，其内容就不能被更改了。
        String result = s.substring(2);

        System.out.println(result);
    }
}
