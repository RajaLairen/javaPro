public class SumOfDigit{
    public static void main(String[] args){
        System.out.println(sumOfDigit(424));
    }
    
    public static int sumOfDigit(int value){
        int sum=0;
        if(value>=10){
            while(value!=0){
                int remainder=value%10;
                value=value/10;
                sum+=remainder;
            }
            return sum;
        }
        else{
            return -1;
        }
    }
}