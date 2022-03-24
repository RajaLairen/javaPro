import java.util.Scanner;
public class MinMaxOutputChallenge{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int Min=0;
        int Max=0;
        boolean oneTime=true;
        
        while(true){
            System.out.println("Enter Number: ");
            boolean isInt=scanner.hasNextInt();
            if(isInt){
                int value=scanner.nextInt();
                if(oneTime){
                    Min=value;
                    Max=value;
                    oneTime=false;
                }
                if(value<Min){
                    Min=value;
                }
                if(value>Max){
                    Max=value;
                }
            }
            else{
                break;
            }
        }
        
        System.out.println("The maximum number is "+Max);
        System.out.println("The minimum number is "+Min);
    }
}