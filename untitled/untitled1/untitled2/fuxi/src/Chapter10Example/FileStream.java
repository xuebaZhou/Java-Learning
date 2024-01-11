package Chapter10Example;

// 将文件中的数据读取出来，并输出到屏幕上面

import java.io.FileInputStream;
import java.io.IOException;

public class FileStream {
    public static void inputstream1(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int c;
            int i = 0;
//            当输入流读取结束时，会得到-1，以标志数据流的结束
            while ((c = fis.read()) != -1) {
                i++;
                System.out.print((char) c);
            }
            System.out.println();
            System.out.println("文件字节数" + i);
            fis.close();
        } catch (IOException e) {
            System.err.println("发生异常" + e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        相关路径要找对
        FileStream.inputstream1("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/TestFileStream.java");
    }
}
