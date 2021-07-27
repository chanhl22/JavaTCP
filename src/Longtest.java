import java.util.Scanner;

public class Longtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 3000000000L;
        long b = 300000000 * 10L;
        long c = 300000000;
        long d = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c*d);

        //3000000000
        //3000000000
        //3000000000

        //long a1 = 3000000000; //Error
        long b1 = 300000000 * 10;
        long c1 = 300000000;
        long d1 = 100;
        //System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1*d1);

        //-1294967296
        //30000000000

        long e = c * 100;
        System.out.println(e);
        //30000000000
    }
}
