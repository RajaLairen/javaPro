import java.util.Scanner;

public class UserInputChallenge{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int Sum=0;
        
        for(int i=1;i<=10;i++){
            int digit;
            System.out.println("Enter number #"+i+" :");
            boolean hasInt=scanner.hasNextInt();
            if(hasInt){
                digit=scanner.nextInt();
                Sum+=digit;
            }
            else{
                System.out.println("Invalid value");
                i--;
            }
            scanner.nextLine();
        }
        
        System.out.println("The result  is "+Sum);
        
        scanner.close();
    }
}