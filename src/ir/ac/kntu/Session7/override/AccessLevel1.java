package ir.ac.kntu.Session7.override;

public class AccessLevel1 {

}


class A {
    void m() {
        System.out.println("super");
    }

    public Object m2(String o) {
        System.out.println("m2 super");
        return new Object();
    }

    public void m3(String o) {
        System.out.println("m2 super");
    }
}


class B extends A {

    //access level of the overrided method (subclass method),
    // should be stronger(higher) than super class
    public void m() {
        System.out.println("sub");
    }

    //overridden
    @Override
    public String m2(String s) {
        System.out.println(s + " in sub");
        return s;
    }

//    @Override does not override
    public void m3(Object s) {
        System.out.println("m2 super");
    }



}