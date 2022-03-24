public class PrimeNumber{
    public static void main(String[] args){
        System.out.println(isPrime(5));
    }
    
    public static boolean isPrime(int value){
        if(value==1){
            return false;
        }
        
        for(int i=2;i<=value/2;i++){
            if(value%i==0){
                return false;
            }
        }
        return true;
    }
}