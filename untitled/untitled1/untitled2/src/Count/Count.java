package Count;

public class Count {
    private int serialNumber;
    private static int counter=0;
    public Count(){
        counter++;
        serialNumber=counter;
        System.out.println(serialNumber);
    }

    public class Test{
        Count c1=new Count();
        Count c2=new Count();
    }

    public static void main(String[] args) {
        Count c1=new Count();
        Count c2=new Count();

        //System.out.println(c1.serialNumber);
    }
}


