package Chapter10Example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
//        DataOutputStream out = new DataOutputStream(new FileOutputStream("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/file2.txt"));
//        double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
//        int[] units = {12, 8, 13, 29, 50};
//        String[] descs = {"java", "Operation System", "Software Engineering", "C++", "Data Structure"};
//        for (int i = 0; i < prices.length; i++) {
//            out.writeDouble(prices[i]);
//            out.writeInt(units[i]);
//            out.writeUTF(descs[i]);
//            System.out.println(prices[i]+" "+units[i]+" "+descs[i]);
//        }
//        out.close();

        // 上面的代码，会以二进制的形式写入文件中，到时候就是不能够看清楚具体的值，就是乱码了
        PrintWriter out = new PrintWriter(new FileOutputStream("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/file2.txt"));
        double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
        int[] units = {12, 8, 13, 29, 50};
        String[] descs = {"java", "Operation System", "Software Engineering", "C++", "Data Structure"};
        for (int i = 0; i < prices.length; i++) {
            out.println(prices[i] + "\t" + units[i] + "\t" + descs[i]);
        }
        out.close();
    }
}
