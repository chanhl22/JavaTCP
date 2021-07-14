public class Main {
    static void test(int k){
        k = k + 1;
    }

    public static void main(String[] args) {
        int k = 1;
        test(k);
        System.out.println(k);
    }
}

