package Test;


public class InstanceofTest3 {

    public static void troublesome() throws Exception{
        int i=0;
        String get[]={"dsdfjs","fdusheuw","ysgsdiues"};
        while (i<4){
            System.out.println(get[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        try{
            troublesome();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
