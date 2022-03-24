public class SecondMinuteChallenge{
    public static void main(String[] args){
        getDurationString(3660);
    }
    
    public static void getDurationString(int minutes,int second){
        if(minutes>0 && second >=0 && second <=59){
            int Hour=minutes/60;
            int Minutes=minutes%60;
            int Second=second;
            System.out.println(Hour+"h "+Minutes+"m "+Second+"s");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
    
    public static void getDurationString(int second){
        if(second>=0){
            int Minutes=second/60;
            int Second=second%60;
            getDurationString(Minutes,Second);
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}