package ir.ac.kntu.Session7.overload;


public class Main {
    public static void main(String[] args) {
        Overload1 overload1 = new Overload1();
        overload1.move(Speed.FAST);
        overload1.move(Speed.FAST);
        overload1.move(Speed.SLOW);
        overload1.move(Speed.FAST);
        overload1.move(Speed.FAST);
    }
}
