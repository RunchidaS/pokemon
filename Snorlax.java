
public class Snorlax extends Pokemon{
    public Snorlax(String name){
        super(name, 200, "Normal", "snorlax.gif");
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(5);
    }
}