
public class Pikachu extends Pokemon{
    

    public Pikachu(String name){
        super(name, 100, "Electric", "pikachu.gif");
    }

    

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(10);
    }

    
}