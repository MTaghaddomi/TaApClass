
class Coffee{
    public final static String SMALL = "SMALL";
    public final static String BIG = "BIG";
    public final static String HUGE = "HUGE";

    private String size;
    private int ounces;

    public Coffee(String size, int ounces){
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
        Coffee smallDrink = new Coffee(Coffee.SMALL, 2);   
        Coffee hugeDrink = new Coffee(Coffee.HUGE, 4);   

        System.out.println(hugeDrink);
    }
}
