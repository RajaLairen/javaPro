public class staticMethod{
    private static int value=5;
    
    public static void main(String[] args){
        staticMethod obj1=new staticMethod();
        obj1.Display();
    }
    
    void Display(){
        System.out.println(value);
    }
}