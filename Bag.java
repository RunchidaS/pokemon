import java.util.*;

public class Bag {
    private ArrayList<Pokemon> bag;    

    public Bag(){
        bag = new ArrayList<Pokemon>();             
        bag.add(new Pikachu("MyPikachu"));  
    }  
    
    public ArrayList<Pokemon> getBag(){
        return bag;
    }

    public void setBag(Pokemon p){
        bag.add(p);
    }


}
