public class OOPChallenge{
    public static void main(String[] args){
        Hamburger hamburger=new Hamburger("Bread roll",true,100);
        HealthyBurger healthyBurger=new HealthyBurger(200);
        DeluxeHamburger deluxeBurger=new DeluxeHamburger(300);
        System.out.println(hamburger.getType() + " $"+hamburger.priceHamburgerOnly());
        hamburger.addLettuce(1);
        hamburger.addTomato(1);
        hamburger.addCarrot(2);
        System.out.println("Total price for "+hamburger.getType()+" $"+hamburger.getTotalPrice());
        System.out.println(healthyBurger.getType()+" $"+healthyBurger.healthyBurgerPriceOnly());
        healthyBurger.addLettuce(1);
        healthyBurger.addCabbage(1);
        healthyBurger.addSpinach(1);
        healthyBurger.addBrocoli(1);
        System.out.println("Totol price for "+healthyBurger.getType()+" $"+healthyBurger.getTotalPrice());
        System.out.println(deluxeBurger.getType()+" $"+deluxeBurger.deluxeBurgerPriceOnly());
    }
}

class Hamburger{
    protected String type;
    protected double price;
    protected String rollType;
    protected Boolean meat;
    protected double initialPrice;
    
    Hamburger(String rollType,Boolean meat,double price){
        this.rollType=rollType;
        this.meat=meat;
        this.price=price;
        initialPrice=price;
        this.type="Hamburger";
    }
    
    public void addLettuce(int quantity){
        this.price+=5*quantity;
        System.out.println("Lettuce added for $5");
    }
    
    public void addTomato(int quantity){
        this.price+=10*quantity;
        System.out.println("Tomato added for $10");
    }
    
    public void addCarrot(int quantity){
        this.price+=15*quantity;
        System.out.println("Carrot added for $15");
    }
    
    public void addCabbage(int quantity){
        this.price+=20*quantity;
        System.out.println("Cabbage added for $20");
    }
    
    public double getTotalPrice(){
        return this.price;
    }
    
    public String getType(){
        return this.type;
    }
    
    public String getRollType(){
        return this.rollType;
    }
    
    public double priceHamburgerOnly(){
        return initialPrice;
    }
    
    public double priceHamburgerLettuce(int quantity){
        return initialPrice+=5*quantity;
    }
    
    public double priceHamburgerTomato(int quantity){
        return initialPrice+=10*quantity;
    }
    
    public double priceHamburgerCarrot(int quantity){
        return initialPrice+=15*quantity;
    }
    
    public double priceHamburgerCabbage(int quantity){
        return initialPrice+=20*quantity;
    }
}

class HealthyBurger extends Hamburger{
    private double initialPrice;
    
    
    HealthyBurger(double price){
        super("Brown red Bred roll",true,price);
        this.price=price;
        initialPrice=price;
        this.type="Healthy Burger";
    }
    
    public void addBrocoli(int quantity){
        this.price+=20*quantity;
        System.out.println("Brocoli added for $20");
    }
    
    public void addSpinach(int quantity){
        this.price+=25*quantity;
        System.out.println("Spinach added for $25");
    }
    
    public double priceHamburgerBrocoli(int quantity){
        return initialPrice+=20*quantity;
    }
    
    public double priceHamburgerSpinach(int quantity){
        return initialPrice+=25*quantity;
    }
    
    public double healthyBurgerPriceOnly(){
        return initialPrice;
    }
}

class DeluxeHamburger extends Hamburger{
    private double initialPrice;
    DeluxeHamburger(double price){
        super("Bread Roll",true,price);
        this.price=price;
        this.type="DeluxeHamburger";
        initialPrice=price;
    }
    
    public double deluxeBurgerPriceOnly(){
        return initialPrice;
    }
}