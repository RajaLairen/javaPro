import Package.Mypakage.*;
public class overrideExample{
    public static void main(String[] args){
        overrideExample obj1=new overrideExample();
        A obj2=new A();
        obj2.Show();
    }
    
    void Display(){
        System.out.println("Parent Class");
    }
}

class A extends overrideExample{
   
    
    void Show(){
        Display();
    }
     @Override
    void Display(){
        System.out.println("Child Class");
    }
}