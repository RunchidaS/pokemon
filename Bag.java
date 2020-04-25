import java.util.*;

public class Bag {
    private ArrayList<Pokemon> bag = new ArrayList<Pokemon>();;    

    public Bag(){
                      
        bag.add(new Pikachu("MyPikachu")); 
        bag.add(new Squirtle("MySquirtle")); 
    }  
    
    public ArrayList<Pokemon> getBag(){
        return bag;
    }

    public void setBag(Pokemon p){
        bag.add(p);
    }

}
