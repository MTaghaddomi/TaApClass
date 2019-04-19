package ir.ac.kntu.Session7.override;

public class Override2 {
}
// why the access level should be higher and stronger than super class?
// from https://www.geeksforgeeks.org/overriding-in-java/
class Parent {
    // private methods are not overridden
    // TODO: 4/19/2019 try final and static, can we?! 
    private void m1() {
        System.out.println("From parent m1()");
    }

    protected void m2() {
        System.out.println("From parent m2()");
    }
}

class Child extends Parent {
    // new m1() method
    // unique to Child class
    private void m1() {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    // TODO: 4/19/2019  try weaken accessibility
    @Override
    public void m2() {
        System.out.println("From child m2()");
        super.m2();
    }



}