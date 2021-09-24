package kr.poly;

public interface RemoCon { //객체 생성X
    //final static(상수) 사용 가능
    //public static final int MAXCH = 100;
    int MAXCH = 100; //RemoCon.MAXCH
    int MINCH = 1;
    //추상 메서드
    public void chUp();
    public void chDown();
    public void internet();
}
