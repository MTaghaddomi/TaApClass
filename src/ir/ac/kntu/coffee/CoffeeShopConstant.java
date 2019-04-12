
class Coffee1{
    public final static String SMALL = "SMALL";
    public final static String BIG = "BIG";
    public final static String HUGE = "HUGE";

    private String size;
    private int ounces;

    public Coffee1(String size, int ounces){
        this.size = size;
        this.ounces = ounces;
    }

    public int getSize(){
        return ounces;
    }

    public String toString(){
        return "coffee size: " + size;
    }
}

public class CoffeeShopConstant{
    public static void main(String[] args){
        Coffee1 smallDrink = new Coffee1(Coffee1.SMALL, 2);   
        Coffee1 hugeDrink = new Coffee1(Coffee1.HUGE, 4);   

        System.out.println(hugeDrink);
    }
}
