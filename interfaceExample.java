public class interfaceExample{ 
    public static void main(String[] args){
        B objb=new B();
        D objd=new D();
        objb.func1();
        objb.Display();
        objd.printable();
        objd.showable();
        objd.func1();
        objd.func2();
        objd.func3();
	}
}

interface A{
    int value=10;//compiler add public static final int value;
    void Display();
    void func1();//compiler add public abstract void func1();
}

class B implements A{
    
    //Wont work because func1() in interface add  public by default so child have high access modifier of same
    // @Override
    // void func1(){
    //     System.out.println("func1");
    // }
    
    @Override
    public void func1(){
        System.out.println("func1");
    }
    
    @Override
    public void Display(){
        System.out.println(value);
    }
}


//Interface function should not contain body as it is abstract but we can use default and static to define function in interface
interface Printable{
    void printable();
    default void func1(){
        System.out.println("func1");//using defult in interface we can use function body;
    }//It add public void default func1() by compiler
    
    
    static void func2(){
        System.out.println("func2");
    };
}

interface Showable extends Printable{
    void showable();
    static void func3(){

    }
}

class D implements Showable{
    @Override
    public void printable(){
        System.out.println("Printable");
    }
    
    @Override
    public void showable(){
        System.out.println("Showable");
    }
    
    @Override
    public void func1(){
        System.out.println("Modified func1");
    }
    
    //@Override wont work
    public void func2(){
        System.out.println("Modified func2");
    }
    
    public void func3(){
        System.out.println("Modified func3");
    }
}





