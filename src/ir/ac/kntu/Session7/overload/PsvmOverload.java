package ir.ac.kntu.Session7.overload;


public class PsvmOverload {

    // Superpower main()
    public static void main(String[] args) {
        System.out.println("Hi  (from main)");
        PsvmOverload.main("hehehe");
    }

    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        PsvmOverload.main("Dear Main","My Main");
    }
    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}
