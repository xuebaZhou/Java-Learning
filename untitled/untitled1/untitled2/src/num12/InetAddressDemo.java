package num12;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        InetAddress ia1=null;
        InetAddress ia2=null;
        InetAddress ia3[]=null;
        try{
            ia1=InetAddress.getByName("www.163.com");
            ia2=InetAddress.getLocalHost();
            ia2=InetAddress.getByName("172.29.144.106");
            ia3=InetAddress.getAllByName("www.sina.com");
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        System.out.println("hostName="+ia1.getHostName()+" IP="+ia1.getHostAddress());
        System.out.println("hostName="+ia2.getHostName()+" IP="+ia2.getHostAddress());
        for (int i = 0; i < ia3.length; i++) {
            System.out.println("hostName="+ia3[i].getHostName()+" IP="+ia3[i].getHostAddress());
        }
    }
}
