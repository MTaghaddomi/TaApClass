package ir.ac.kntu.Session7.javadoc;

/**
 * This calss is for testing and making instace of Class Person.
 *
 * @author MahYazdani
 * @see Person
 * @since v.1
 */
public class Main {
    /**
     * This is the main method which makes use of Person calss and methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        Person person = new Person("Ali", 60.5, 170);
        double BMInumber = person.calculateBMInumber();
        if (BMInumber >= 17.5 && BMInumber <= 25) {
            System.out.println("good");
        } else {
            System.out.println("not good");
        }
    }


}

