import java.util.Scanner;
public class InputOutput{
    public static void main(String[] args){
        CheckNextInput();
    }
    
    public static void Input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("You Age: ");
        int Age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Age "+Age);
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Your name is "+name);
        System.out.println("Enter your age: ");
        String age=scanner.nextLine();
        System.out.println("Your age is "+age);
    }
    
    public static void CheckNextInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter something: ");
        int value=scanner.nextInt();
        String name1=scanner.nextLine();
        String name2=scanner.nextLine();
        String name3=scanner.nextLine();
        String name4=scanner.nextLine();
        
        System.out.println(name1+"1");
        System.out.println(name2+"2");
        System.out.println(name3+"3");
        System.out.println(name4+"4");
        
    }
}