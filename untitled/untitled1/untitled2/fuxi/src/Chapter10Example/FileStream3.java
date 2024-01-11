package Chapter10Example;

import java.io.FileOutputStream;
import java.io.IOException;

//      将字符串写入文件fileName中
public class FileStream3 {
    public  static void outputstream1(String str,String fileName){
        byte[] b=str.getBytes();
        try {
            FileOutputStream fos=new FileOutputStream(fileName);
            fos.write(b);
//            缓冲区中的数据立即写入到 "file2.txt" 文件中
//            可以确保数据被及时地写入到磁盘，而不是等待缓冲区满或文件流关闭时才进行写入操作。
            fos.flush();
            System.out.println("文件字节数"+b.length);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        在 Java 中，每个字符都用 Unicode 编码表示，通常一个 Unicode 编码占用两个字节
        FileStream3.outputstream1("Java程序设计","C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/fuxi/src/Chapter10Example/file2.txt");
    }

}
