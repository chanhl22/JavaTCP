package enumtest;

public enum Type {
    SPRING("1월"), // 봄
    SUMMER("2월"), // 여름
    FALL("3월"), // 가을
    WINTER("1월"); // 겨울

    private final String month;

    Type(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}
