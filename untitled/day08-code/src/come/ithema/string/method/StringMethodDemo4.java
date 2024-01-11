package come.ithema.string.method;

public class StringMethodDemo4 {
    /*
            String 类的替换方法：
                public String replace(CharSequence target ,CharSequence replacement)
                            参数1：旧值；
                            参数2：新值；
     */
    public static void main(String[] args) {
            String s="ndsiufhiudbfo";

        String result = s.replace("siu", "abc");

        System.out.println(result);
    }
}
