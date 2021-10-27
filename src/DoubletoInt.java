public class DoubletoInt {
    public static void main(String[] args) {
        int a = 1;
        double b = 2;
        //a = a + b;
        a += b; //"a += b" 는 "a = (int) (a + b)" 와 동일합니다.
        System.out.println(a);
        b = a + b;
        System.out.println(b);
    }
}
