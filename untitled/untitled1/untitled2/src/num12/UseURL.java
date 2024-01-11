package num12;
//  读取URL数据输出到控制台中

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class UseURL {
    public static void main(String[] args) {
        try{
            URL url=new URL("http://www.hitwh.edu.cn");
            InputStreamReader isr=new InputStreamReader(url.openStream(),"UTF-8");
            BufferedReader br=new BufferedReader(isr);
            String readStr;
            while((readStr= br.readLine())!=null){
                System.out.println(readStr);
            }
            br.close();
        }catch(MalformedInputException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
