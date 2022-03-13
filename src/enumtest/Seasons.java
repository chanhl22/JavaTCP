package enumtest;

public class Seasons {
    public static void main(String[] args) {

        Type nowSeason = Type.SPRING;
//        String name = nowSeason; // Error
        String name = nowSeason.name(); // "Spring" 반환
        System.out.println(name);
        String month = nowSeason.getMonth();
        System.out.println(month);
    }
}
