public abstract class Pokemon {
    protected String name;
    protected String nemName;
    protected int hp;
    protected String type;
    protected String weight;
    protected String height;
    protected String monPic;
    


    public Pokemon (String name){
        this.name = name;
        this.hp = 0;   
    }

    public Pokemon(String name, int maxHp, String type, String monPic){
        this.name = name;
        this.hp = (int)(Math.random() * maxHp);
        this.type = type;
        this.monPic = monPic;
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
    
    public String getPic(){
        return monPic;
    }

    public String toString(){
        return name;
       
    }

    public void setName(String name){
        this.name = name;
    }   

    public void setHP(int hp){
        this.hp = hp;
    }  
         
}