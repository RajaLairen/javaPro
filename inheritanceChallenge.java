public class  inheritanceChallenge extends  car{
   
    private String carType;
    private int speed;
    private String color;
    
    inheritanceChallenge(int speed,String color,String carType){
        super(speed,color);
        this.speed=speed;
        this.color=color;
        this.carType=carType;
        System.out.println("Audi Constructor");
    }
    
    public void Run(){
        System.out.println("I can run at "+speed);
        System.out.println("Color: "+color);
        System.out.println("CarType: "+carType);
    }
    
    
     public static void main(String[] args){
        inheritanceChallenge Audi= new inheritanceChallenge(100,"Grey","Audi");
        Audi.Run();
        car Car1=new car(50,"Car1");
        Car1.Run();
        vehicle Vehicle=new vehicle(true,true,true,true,20);
    }
}