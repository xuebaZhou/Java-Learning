import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str[] = new String[n];
        int[] arr={0};
        int maxn=0,mimn=101;
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {

        }



        System.out.println(str);
    }

    public static int Isprime(int n) {
        if (n == 1 || n == 0)
            return 0;
        else if (n == 2)
            return 1;
        else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0)
                    return 0;
            }
            return 1;
        }
    }
}