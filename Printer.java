public class Printer{
    private int toner;
    private int numberOfPage;
    private boolean duplex;
    private String printingThing;
    
    Printer(int toner,boolean duplex,int numberOfPage,String printingThing){
        this.toner=toner;
        this.duplex=duplex;
        this.numberOfPage=numberOfPage;
        this.printingThing=printingThing;
        
    }
    
    public void addToner(int toner){
        if(toner>=0 && toner<=100){
            this.toner+=toner;
        }
    }
    
    public void numberOfPage(int numberOfPage){
        this.numberOfPage=numberOfPage;
    }
    
    public void printingThing(String thing){
        this.printingThing=thing;
    }
    
    public void print(){
        System.out.println("Printing: "+printingThing);
        System.out.println("Toner level: "+ toner);
        System.out.println("Number of page: "+numberOfPage);
    }
}