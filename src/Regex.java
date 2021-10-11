public class Regex {
    public static void main(String[] args) {
        String ans = "z-+.^._";
        String str1 = ans.replaceAll("[^abcdefghijklmnopqrstuvwxyz0123456789-_.]", "");
        String str2 = ans.replaceAll("[^-_.abcdefghijklmnopqrstuvwxyz0123456789]", "");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();

        String a = "123456789_^32413!@";
        String s = a.replaceAll("[^9-_]", "");
        System.out.println(s);
        System.out.println();

        String b = ".asdas.";
        String s1 = b.replaceAll("^[.]|[.]$", "");
        String s2 = b.replaceAll("^[.]$", "");
        System.out.println(s1);
    }
}