public class Squirtle extends Pokemon{
    public Squirtle(String name){
        super(name , 80, "Water", "squirtle.gif");
        
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(50);
    }
}