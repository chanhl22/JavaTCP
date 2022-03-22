import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
    public static void main(String[] args) {
        //RemoCon r = new RemoCon();

        RemoCon r = new TV();
        r.chUp();
        r.chDown();
        r.internet();
        //r.game() //불가능

        r = new Radio();
        r.chUp();
        r.chDown();
        r.internet();

        TV t = new TV();
        t.chUp();
        t.chDown();
        t.internet();
        t.game();
    }
}
