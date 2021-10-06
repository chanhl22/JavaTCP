public class Compare {
    public static void main(String[] args) {
        String a = "AB";
        String b = "ABDF";
        String c = "AC";
        String d = "ABCD";
        System.out.println(a.compareTo(b)); //-2
        System.out.println(a.compareTo(c)); //-1
        System.out.println(b.compareTo(c)); //-1
        System.out.println(a.compareTo(d)); //-2
        System.out.println(b.compareTo(a)); //2
        System.out.println(c.compareTo(b)); //1

        int e = 3;
        int f = 4;
        System.out.println(Integer.compare(e, f)); //-1

        String aa = "abcd";
        String bb = "AB";
        String cc = "ABCD";
        System.out.println(aa.compareTo(bb)); //32
        System.out.println(aa.compareToIgnoreCase(bb)); //2
        System.out.println(aa.compareToIgnoreCase(cc)); //0
    }
}
