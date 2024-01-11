package come.ithema.string.method;

public class StringMethodDemo5 {
    /*
            String类的切割方法：

                public String[] split(String regex):根据传入的字符串作为规则，切割当前的字符串

                先正常指定切割规则，后来发现没有得到自己想要的效果，就可以尝试在规则前面，加入 \\
     */
    public static void main(String[] args) {

        String s="192,168,1,1";
        String s1="192.168.1.1";
        String s2="199+158+6+3";

        String[] sArr = s.split(",");
        String[] sArr1=s1.split(".");
        // 这个.在指定规则的时候是一个通配符，可以代表任意字符

        // 解决方法：在规则前面加上两根斜线
        String[] SArr=s1.split("\\.");

        String[] sArr2=s2.split("\\+");// 这里直接写加号会报错的，需要加上转义字符

        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
        for (int i = 0; i < sArr1.length; i++) {
            System.out.println(sArr1[i]);
        }
        for (int i = 0; i < SArr.length; i++) {
            System.out.println(SArr[i]);
        }
        for (int i = 0; i < sArr2.length; i++) {
            System.out.println(sArr2[i]);
        }
    }
}
