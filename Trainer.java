import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> bag;
    private ArrayList<Pokemon> pokemons;
    private Scanner sc;
    
    private int no = 0;
    
    

    public Trainer(){
        bag = new ArrayList<Pokemon>();             
        bag.add(new Pikachu("MyPikachu"));
        bag.add(new Jigglypuff("MyJigglypuff"));

        sc = new Scanner(System.in);
        
    }

    
    public void play(){
        String cmd = "" ;        

        do{
            System.out.print("\nEnter cmd: ");
            cmd = sc.nextLine();

            if(cmd.equals("print")){
                System.out.println("\npokemon in bag");
                printPokemon(bag);
            }

            else if(cmd.equals("catch")){
                catchPokemon();
            } 

            // else if(cmd.equals("rename")){
            //     renamePokemon();
            // } 

        }while(!cmd.equals("quit"));
    }

    
    // public void renamePokemon(){
    //     System.out.println("\npokemon in bag ");
    //     printPokemon(bag);

    //     System.out.print("\nselect pokemon number for rename: ");
    //     no = sc.nextInt();
    //     //Pokemon newNamePokemon = bag.get(no);
    //     //Pokemon oldName;

    //     System.out.print("\nnew name: ");
    //     String newName = sc.nextLine();

    //     oldName.setName(newName);     
    // }

    public void catchPokemon(){
        System.out.println("\nCatch Pokemons\n");
        

        System.out.println("Pokemon around you\n");
        printPokemon(pokemons);

        System.out.print("\nSelect pokemon number or run(-1) : ");
        no = sc.nextInt();
        if(no < 0){
            sc.nextLine();
            return;
        }

        Pokemon wildPokemon = pokemons.get(no);
        
        System.out.println("\npokemon in bag ");
        printPokemon(bag);

        System.out.print("\nselect pokemon in bag: ");
        no = sc.nextInt();
        Pokemon myPokemon = bag.get(no);

        boolean isWin = false;

        do {
            myPokemon.attack(wildPokemon);
            if (wildPokemon.getHP() == 0){
                isWin = true;
                break;
            }
            else{
                wildPokemon.attack(myPokemon);
                if (myPokemon.getHP() == 0){
                    isWin = false;
                    break;
                }
            }
        }while(true);

        if(isWin){
            System.out.println("\nyou catch: " + wildPokemon.getName() + "\n");
            bag.add(wildPokemon);
        }
        else{
            System.out.println("\n" + wildPokemon.getName() + " win" + "\n");
        }
        
       sc.nextLine();        

    }

    public void printPokemon(ArrayList<Pokemon> pokemons){
        
        int number = 0 ;
        for(Pokemon p: pokemons){
            System.out.println("" + number + " " + p + " HP: " + p.getHP());
            number++;
        }
    }

    public ArrayList<Pokemon> getBag(){
        return bag;
    }

   

    public ArrayList<Pokemon> getPokemon(){
        return pokemons;
    }

}
