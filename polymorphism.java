public class polymorphism{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            Movie movie=randomMovie();
            movie.getMovieName();
            movie.getDescription();
        }
    }
    
    public static Movie randomMovie(){
        int random=(int)(Math.random()*2)+1;
        
        switch(random){
            case 1:
                return new HomeAlone();
            case 2:
                return new TomorrowLand();
        }
        return null;//Default case Must include
    }
}

class Movie{
    protected String name;
    protected String description;
    Movie(String name){
        this.name=name;
        this.description="No description";
    }
    public void getDescription(){
        System.out.println(description);
    }
    
    public void getMovieName(){
        System.out.println(name);
    }
}

class HomeAlone extends Movie{
    
    HomeAlone(){
        super("Home Alone");
        this.description="A film that a kids safe his house from thief";
    }
    
    @Override
    public void getDescription(){
        System.out.println(description);
    }
    
    @Override
    public void getMovieName(){
        System.out.println(name);
    }
}

class TomorrowLand extends Movie{
    TomorrowLand(){
        super("Tomorrow Land The World Beyond");
        this.description="A film about the future and multiple universe";
    }
    
    @Override
    public void getDescription(){
        System.out.println(description);
    }
    
    @Override
    public  void getMovieName(){
        System.out.println(name);
    }
}






