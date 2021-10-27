import java.util.ArrayList;

public class Stream1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
        }
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            b.add(i);
        }
        long count = b.stream().filter(x -> x < 11).count();
        System.out.println(count);

//        IntStream.range(1, 11 ).filter(i-> i%2==0)
//                .forEach(System.out::println);
    }
}
