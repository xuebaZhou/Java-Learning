package come.ithema.string.method;

public class StringMethodDemo2 {
    /*
        String类用于遍历的方法:

            public char[] toCharArray() 将此字符串转换为一个新的字符数组

            public char charAt(int index) 返回指定索引处的 char 值

            public int length() 返回此字符串的长度
     */
    public static void main(String[] args) {

        //print1();

        //print2();


    }

    /**
     * 字符串的第二种遍历方式
     */
    private static void print2() {
        String s = "itheima";
 // 循环中不断地调用方法，需要时间
        for (int i = 0; i < s.length(); i++) { // s.fori再按快捷键可以快速生成for循环

            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    /**
     * 字符串的第一种遍历方式
     */
    private static void print1() {
        String s = "4654f3dfs4g65fds4g53f4g65f4g5f4";
    // 只在开始时调用了一次方法，在循环中没有，效率高一点
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        // Ctrl+Alt+m 可以抽取一种方法

        // 如果提取出的方法和主方法时平级的，则要添加static，否则的话就不添加
    }
}
