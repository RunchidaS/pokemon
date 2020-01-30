public class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int pp;

    public Pokemon (){
        this.level = 1;
        this.hp = 50;
        this.pp = 20;
    }

    public void setName(String name){
        this.name = name;
    }

    public void eatBerry(){
        this.hp += 5;
    }

    public void acttack(){
        this.level += 1;
        this.hp -= 10;
        this.pp -= 1;
    }

    public void sleep(){
        this.hp += 5;
    }

    public void run(){
        this.hp += 5;
    }

    public void faint(){
        this.hp = 0;
    }

    public void displayStatus(){
        System.out.println("NAME = "+this.name);
        System.out.println("LEVEL = "+this.level);
        System.out.println("HP = "+this.hp);
        System.out.println("PP = "+this.pp);
    }
}
