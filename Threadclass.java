public class Threadclass{ 
public static void main(String[] args){
    myThread thread1=new myThread();
    thread1.start();
 }
}
s
class myThread extends Thread{
    int second=0;
    int minute=0;
    int hour=0
    @Override
    public void run(){
        try{
            System.out.println(hour+":"+minute+":"+second);
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        run();
    }
}