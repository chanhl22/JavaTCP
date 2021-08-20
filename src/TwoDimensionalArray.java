import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6, 7}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(Arrays.deepToString(b));
        for (int i = 0; i < 2; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.deepToString(b));
    }
}
