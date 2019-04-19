package ir.ac.kntu.Session7.superThis;

public class SuperCallCons {
}

class Super {
    private int a;

    public Super(int a) {
        this.a = a;
    }
}

class Child extends Super {
    /*
         By default :

        Child(){
            super() // but there is no super() ! compile error
        }
         */

    public Child(int a) {
        super(a);
    }



}

