public class printerMain{
    public static void main(String[] args){
        Printer printer=new Printer(0,true,0,"Null");
        printer.addToner(50);
        printer.numberOfPage(5);
        printer.printingThing("Photo");
        printer.print();
        
    }
}