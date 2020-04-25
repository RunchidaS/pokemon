public abstract class Pokemon {
    protected String name;
    protected int hp;
    protected String type;
    
    
    public Pokemon(String name, int maxHp, String type){
        this.name = name;
        this.hp = (int)(Math.random() * maxHp);
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public int getHP(){
        return hp;
    }
    
    public String getType(){
        return type;
    }

    public String toString(){
        return name;
       
    }

    public void setHP(int hp){
        this.hp = hp;
    }  
         
}