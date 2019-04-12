enum CoffeeSize2{
    SMALL, BIG, HUGE;
}

class Coffee2{
    private CoffeeSize2 size;

    public Coffee2(CoffeeSize2 size){
        this.size = size;
    }

    public String toString(){
        return "coffee size: " + size;
    }
}

public class CoffeeShopEnum{
    public static void main(String[] args){
        Coffee2 hugeDrink = new Coffee2(CoffeeSize2.HUGE);   
        Coffee2 smalldrink = new Coffee2(CoffeeSize2.SMALL);   

        System.out.println(hugeDrink);
    }
}
