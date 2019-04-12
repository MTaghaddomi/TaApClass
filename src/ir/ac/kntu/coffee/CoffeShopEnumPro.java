enum CoffeeSize3{
    SMALL(2), BIG(4), HUGE(6);

    private final int ounces;

    CoffeeSize3(int ounces){
        this.ounces = ounces;
    }

    public final String toString(){
        return this.name() + ": " + ounces;
    }

    public final int getSize(){
        return ounces;
    }

}

class Coffee3{
    private CoffeeSize3 size;

    public Coffee3(CoffeeSize3 size){
        this.size = size;
    }

    public String toString(){
        return size.toString();
    }
}

public class CoffeShopEnumPro{
    public static void main(String[] args){
        Coffee3 hugeDrink = new Coffee3(CoffeeSize3.HUGE);   
        Coffee3 smalldrink = new Coffee3(CoffeeSize3.SMALL);   

        System.out.println(hugeDrink);
    }
}
