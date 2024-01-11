import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

    public static void getsum(){
        int x=10;
        int a[]={2,4,6,8};  // 可变参数被当做数组来处理
        System.out.println(sum(10,2,4));
        System.out.println(sum(10,2,4,6));
//        调用可变参数的方法，传入一个数组
        System.out.println(sum(10,a));
    }
    public static int sum(int x,int ... a){
//        可变参数：在方法声明时不给出参数列表中从某
//        项直至最后一项参数的名称和个数，但是这些参数
//        的数据类型必须相同
//        可变参数只能处于参数列表的最后。
//         一个方法最多只能包含一个可变参数
        int sum=x;
        for(int i=0;i<a.length;i++)sum+=a[i];
        return sum;
    }


    private static void ListExample1() {
        List lt = new LinkedList();
        for (int i = 0; i < 10; i++) lt.add(i);
        System.out.println(lt);
        Collections.shuffle(lt);   // 对元素进行随机排列
        System.out.println(lt);
        Collections.reverse(lt);   // 对元素进行逆序排列
        System.out.println(lt);
        Collections.sort(lt);  // 进行升序排序
        System.out.println(lt);
        System.out.println(Collections.binarySearch(lt,5));  // 折半查找查找特定的对象
    }

    private static void ListExample() {
        List lt = new LinkedList();
        for (int i = 0; i < 10; i++) lt.add(i);// 增加元素
        System.out.println(lt);
        lt.add(1);
        lt.add(2, 10);
        System.out.println(lt);
        lt.set(5, 11); // 设置某一位置的元素
        System.out.println(lt);
        System.out.println((int) lt.get(6) + 10); // 取出来第七个元素，强制转换为int，与10相加
        System.out.println(lt.indexOf(11));   // 返回元素为11的下标值
        lt.remove(1);  // 移走下标为1的元素
        System.out.println(lt);
        lt.remove(1);
        System.out.println(lt);
    }

    private static void HashMapExample() {
        //        https://blog.csdn.net/shi_xiansheng/article/details/117792691
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);
        for (String name : map.keySet()) {
            System.out.println(name + " is " + map.get(name) + " years old");
        }
    }

    private static void LinkedListExample() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

    private static void ArraylistExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("C++");
        for (String language : list) {
            System.out.println(language);
        }
    }

    public static void yangHui(int n) {
        int yh[][] = new int[n][];  // 动态申请二维数组的行长度
        int i;
        for (i = 0; i < n; i++) {
            yh[i] = new int[i + 1];    // 对于每一行，其对应的列的长度是不一样的，也需要动态申请
            yh[i][0] = 1;
            yh[i][i] = 1;

        }
        for (i = 2; i < n; i++) {
            for (int j = 1; j < i; j++)
                yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];// 这是杨辉三角的定义
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(yh[i][j] + "\t");
            System.out.println();
        }
    }

    public static void TestString() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = in.next();
        System.out.print("输入开始位置：");
        int begin = in.nextInt();
        System.out.print("输入终止位置：");
        int end = in.nextInt();
        if (begin >= 0 && begin <= str.length() && end >= 0 && end <= str.length()) {
            str.substring(begin, end);
            System.out.println(str.substring(begin, end));
            System.out.println(str.substring(begin));
        }
    }

    public static void TestStringBuffer() {
        StringBuffer sb = new StringBuffer("James Kobe");
        System.out.println("len=" + sb.length());
        System.out.println("capacity=" + sb.capacity());
        StringBuffer str = new StringBuffer("software");
        System.out.println(str.hashCode());
        str.append(" engineering");
        System.out.println(str.hashCode());
        System.out.println(str);
    }
}
