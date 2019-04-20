package ir.ac.kntu.Session7.javadoc;

/**
 * This is a class models a person with a name,weight and height.
 * and has method for calculating BMI number.
 *
 * @author MahYazdani
 */
public class Person {
    private String name;
    private double weight;
    private int height;

    /**
     * constructor of person class for initializing.
     *
     * @param name   person's String name
     * @param weight person's double weight(in kg).
     * @param height person's int height(in cm).
     */
    public Person(String name, double weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    /**
     * converts the unit of height from meter to centimeter.
     *
     * @return double value of converting cm to m.
     */
    public double convertHeightUnit() {
        return this.height / 100;
    }

    /**
     * converts the unit of height from meter to centimeter.
     *
     * @param height gets a height for converting.
     * @return double value of converting cm to m.
     */
    public static double convertHeightUnit(int height) {
        return height / 100;
    }

    /**
     * calculates the BMI number with weight in kg and height in m.
     *
     * @return double value of bmi number of this person.
     */
    public double calculateBMInumber() {
        return this.weight / Math.pow(this.convertHeightUnit(), 2);
    }

    /**
     * calculates the BMI number with weight in kg and height in m.
     *
     * @param weight person's weight in kg.
     * @param height person's height in cm.
     * @return double value of bmi number of a person.
     */
    public static double calculateBMInumber(double weight, int height) {
        return weight / Math.pow(convertHeightUnit(height), 2);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
