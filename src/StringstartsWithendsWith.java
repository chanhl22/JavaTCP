import java.util.Scanner;

public class StringstartsWithendsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "자바 코딩";
        System.out.println(s1.startsWith("자바"));
        //true

        String s2 = "자바 코딩";
        System.out.println(s1.startsWith("자바 코딩"));
        //true

        String s3 = "자바 코딩";
        System.out.println(s1.startsWith("자바코딩"));
        //false

        String s4 = "자바 코딩";
        System.out.println(s1.startsWith("자바"));
        //true

        String s5 = "자바 코딩";
        System.out.println(s1.startsWith("자바 "));
        //true

        String s6 = "자바 코딩";
        System.out.println(s1.startsWith("자 "));
        //false

        String s7 = "자바 코딩";
        System.out.println(s1.endsWith("자바 코딩"));
        //true

        String s8 = "자바 코딩";
        System.out.println(s1.endsWith("자바코딩"));
        //false
    }
}
