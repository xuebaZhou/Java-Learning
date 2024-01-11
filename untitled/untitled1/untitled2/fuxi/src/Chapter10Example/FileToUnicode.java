package Chapter10Example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileToUnicode {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/file2.txt");
//            传入文件输入流和指定的字符编码（这里是UTF-8），将字节流转换为字符流
            InputStreamReader dis = new InputStreamReader(fis, "UTF-8");
            BufferedReader reader = new BufferedReader(dis);
            String s;
            while ((s = reader.readLine()) != null)
                System.out.println("read: " + s);
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
