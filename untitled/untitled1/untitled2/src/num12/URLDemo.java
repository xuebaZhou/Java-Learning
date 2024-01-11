package num12;

import java.io.IOException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args)throws IOException {
        URL ur10=new URL("http://news.hitwh.edu.cn");
        URL url=new URL(ur10,"/news_show.asp?id=17980");
        System.out.println("url="+url);
        System.out.println("Protocol="+url.getProtocol());//获取该URL的协议名
        System.out.println("Host="+url.getHost());//获取该URL的主机名
        System.out.println("Port="+url.getPort());//获取该URL的端口号
        System.out.println("File="+url.getFile());//获取该URL的文件名
        System.out.println("Ref="+url.getRef());//获取该URL在文件中的相对位
        System.out.println("Path="+url.getPath());//获取该URL的路径
        System.out.println("Authority="+url.getAuthority());//获取该URL的权限信息
        System.out.println("UserInfo="+url.getUserInfo());//获取使用者的信息
    }

}
