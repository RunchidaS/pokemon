
public class Jigglypuff extends Pokemon{
    public Jigglypuff(String name){
        super(name , 100, "Fairy","jigglypuff.gif");
        
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(20);
    }
}