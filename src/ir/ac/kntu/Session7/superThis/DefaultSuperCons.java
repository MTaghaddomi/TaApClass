package ir.ac.kntu.Session7.superThis;

public class DefaultSuperCons {
    public static void main(String[] args) {
        new Child1();
    }
}

class Parent {
    public Parent() {
        System.out.println("Parent");
    }
}

class Child1 extends Parent{
    public Child1() {
        System.out.println("child");
    }
}
