public class Method{
    public static void main(String[] args){
        int playerPosition;
        playerPosition=calculateHighScorePosition(1000);
        displayHighScorePosition("Ajay",playerPosition);
        
        playerPosition=calculateHighScorePosition(900);
        displayHighScorePosition("B",playerPosition);
        
        playerPosition=calculateHighScorePosition(400);
        displayHighScorePosition("C",playerPosition);
        
        playerPosition=calculateHighScorePosition(50);
        displayHighScorePosition("D",playerPosition);
        
    }
    
    public static void displayHighScorePosition(String name,int position){
            System.out.println(name+" managed to get into position "+position);
    }
    
    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }
        else if(score>=500 && score<1000){
            return 2;
        }
        else if(score>100 && score<500){
            return 3;
        }
        else{
            return 4;
        }
    }
    
}