public class PokemonGame{
    
    public static void main(String args[]) {
        Pokemon p1 = new Pokemon();
        
        System.out.println("---------- My Pokemon ----------");
        p1.setName("Pikachu");

        System.out.println("***Begin Status***");
        p1.displayStatus();

        System.out.println("***Update Status***");
        p1.acttack();
        p1.run();
        p1.eatBerry();
        p1.sleep();
        p1.faint();
        p1.displayStatus();

        System.out.println("--------------------------------");
    }
}