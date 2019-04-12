enum CoffeeSize{
    SMALL(2), BIG(4), HUGE(6);

    private final int ounces;

    CoffeeSize(int ounces){
        this.ounces = ounces;
    }

    public final String toString(){
        return this.name() + ": " + ounces;
    }

    public final int getSize(){
        return ounces;
    }

}

class Coffee{
    private CoffeeSize size;

    public Coffee(CoffeeSize size){
        this.size = size;
    }

    public String toString(){
        return size.toString();
    }
}

public class CoffeShopEnumPro{
    public static void main(String[] args){
        Coffee hugeDrink = new Coffee(CoffeeSize.HUGE);   
        Coffee smalldrink = new Coffee(CoffeeSize.SMALL);   

        System.out.println(hugeDrink);
    }
}
