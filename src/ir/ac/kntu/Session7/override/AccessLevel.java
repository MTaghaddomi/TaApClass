package ir.ac.kntu.Session7.override;

public class AccessLevel {

}


class A {
    void m() {
        System.out.println("super");
    }
}


class B extends A {

    //access level of the overrided method (subclass method),
    // should be stronger(higher) than super class
    public void m() {
        System.out.println("sub");
    }
}