package ir.ac.kntu.Session7.overload;

enum Speed {
    SLOW(10), MEDIUM(20), FAST(30);

    private final int speedValue;

    Speed(int value) {
        speedValue = value;
    }

    public int getSpeedValue() {
        return speedValue;
    }
}

public class Overload1 {
    private static int origin = 0;

    //When a method is public, means you can rarely change
    // the method, else the client code may break!
    public void move(Speed speed) {
        int dest = move(speed.getSpeedValue());
        System.out.println(dest);
    }

    // We use private method, to control over methods.
    // Not we have a larger chance to change the method,
    // without break client code
    private int move(int speedValue) {
        return origin += speedValue;

    }

}

