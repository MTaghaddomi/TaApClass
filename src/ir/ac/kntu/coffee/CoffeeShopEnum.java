enum CoffeeSize{
    SMALL, BIG, HUGE;
}

class Coffee{
    private CoffeeSize size;

    public Coffee(CoffeeSize size){
        this.size = size;
    }

    public String toString(){
        return "coffee size: " + size;
    }
}

public class CoffeeShop{
    public static void main(String[] args){
        Coffee hugeDrink = new Coffee(CoffeeSize.HUGE);   
        Coffee smalldrink = new Coffee(CoffeeSize.SMALL);   

        System.out.println(hugeDrink);
    }
}
