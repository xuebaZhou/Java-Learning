package Chapter10Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream1 {
    public static void main(String[] args) {
        try {
            // 说实话，这个路径有点长，但是必须要这样写
            FileInputStream in = new FileInputStream("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/file1.txt");
            FileOutputStream out = new FileOutputStream("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/file2.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
