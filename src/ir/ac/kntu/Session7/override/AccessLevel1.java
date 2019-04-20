package ir.ac.kntu.Session7.override;

public class AccessLevel1 {

}


class A {
    void m() {
        System.out.println("m super");
    }

    public Object m2(String o) {
        System.out.println("m2 super");
        return new Object();
    }

    public void m3(String o) {
        System.out.println("m3 super");
    }
    
    public void m3(Object o) {
        System.out.println("m4 super");
    }
}


class B extends A {

    //access level of the overridden method (subclass method),
    // should be stronger(higher) than super class
    public void m() {
        System.out.println("m sub");
    }

    //overridden
    @Override
    public String m2(String s) {
        System.out.println(s + " in sub");
        return s;
    }

    
    //NOT overridden!!
    //@Override cause compile error
    public void m3(Object s) {
        System.out.println("m3 super");
    }

    //NOT overridden!!
    //@Override cause compile error
    public void m4(String o) {
        System.out.println("m4 sub");
    }


}