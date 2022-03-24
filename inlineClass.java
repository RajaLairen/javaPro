public class inlineClass{
    public static void main(String[] args){
        inlineClass obj1=new inlineClass(){

          public void Display(){
              System.out.println("Hello World");
          }  
        };
        
        obj1.Display();
        
    }
    
    public void Display(){
            
    }
}

// class A {
//     int value;
//     public void setValue(int value){
//         this.value=value;
//     }
//     public void Display(){
//         System.out.println("Hi");
//     }
// }

