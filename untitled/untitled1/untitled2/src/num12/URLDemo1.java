package num12;
//  读取URL数据存储在文件中
import java.io.*;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class URLDemo1 {
    public static void url() {
        Scanner scanner = null;
        URL url = null;
        Thread readURL = null;
        Thread saveURL = null;
        System.out.println("输入URL资源");
        scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        try {
            url = new URL(source);
            InputStream in = url.openStream();
            Runnable read = new Read(in);
            Runnable save = new Save(in);
            readURL = new Thread(read);
            saveURL = new Thread(save);
            readURL.start();
            saveURL.start();
        } catch (MalformedInputException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        url();
    }
}

class Read implements Runnable {
    InputStream in;

    Read(InputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Save implements Runnable {
    InputStream in;

    Save(InputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(in, 1024);
            FileOutputStream fos = new FileOutputStream("C:/Users/周奕兵/IdeaProjects/untitled/untitled1/untitled2/src/num12/my.txt");
            int c;
            while ((c = bis.read()) != -1) {
                fos.write(c);
            }
            bis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}