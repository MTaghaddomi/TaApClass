package ir.ac.kntu.Session7.superThis;

public class ThisCons {
    private int rollNum;

    ThisCons() {
        rollNum = 100;
    }

    ThisCons(int rnum) {
        this();
        /*this() is used for calling the default
         * constructor from parameterized constructor.
         * It should always be the first statement
         * inside constructor body.
         */
        rollNum = rollNum + rnum;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public static void main(String args[]) {
        ThisCons obj = new ThisCons(12);
        System.out.println(obj.getRollNum());
    }
}
