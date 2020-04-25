import java.util.*;


public abstract class  Player{
    String name;
    int exp;
    String genPic;
    int level;
    
    public Player(String name,String genPic){
        this.name = name;
        this.genPic = genPic;
        this.exp = 0;
        this.level = 1;
    }


    public void setExp(int exp){
        this.exp = exp;
    }
    public void setLevel(int level){
        this.level = level;
    }
       
  
    public String getName(){
        return name;
    }
    public String getGenPic(){
        return genPic;
    }
    public int getLevel(){
        return level;
    }   
    public void Uppinglevel(){
        this.level = this.level+1;
    }
    public int getExp(){
        return exp;
    }
   
}