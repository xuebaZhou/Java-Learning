package Chapter10Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream2 {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/file2.txt");
            out.write('h');
            out.write('a');
            out.write('r');
            out.write('b');
            out.write('i');
            out.write('n');
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error :cannot open file for waiting.");
        } catch (IOException e) {
            System.out.println("Error :cannot write to file.");
        }
    }
}
