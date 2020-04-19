import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class InterfacePlay extends JFrame{

    public InterfacePlay(Player player){

        super("Pokemon Game");

        //background----------------------------------------------------------------------------------------------------
        ImageIcon bgImg = new ImageIcon("img/bg.jpg");
        JLabel bgLeble = new JLabel("", bgImg, JLabel.CENTER);
        bgLeble.setBounds(0, 0, 1200, 750);
        setContentPane(bgLeble);
        Container c = getContentPane();        
         
        c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));

        //position panel-----------------------------------------------------------------------------------------------
        JPanel left = new JPanel();
        JPanel center = new JPanel();
        JPanel right = new JPanel();
       

        //set panel
        left.setLayout(new BoxLayout(left,BoxLayout.Y_AXIS));
        left.setBackground(new Color(0,0,0,0));        

        right.setLayout(new BoxLayout(right,BoxLayout.Y_AXIS));
        right.setBackground(new Color(0,0,0,0));
        

        center.setLayout(new BoxLayout(center,BoxLayout.Y_AXIS));
        center.setBackground(new Color(0,0,0,0));     


        //Center(trainer)--------------------------------------------------------------------------------------------------
        JPanel boxCenter = new JPanel();

        JPanel tLevel = new JPanel();
        JPanel tExp = new JPanel();
        JPanel tName = new JPanel();

        //set panel
        boxCenter.setBackground(new Color(0,0,0,0));
        boxCenter.setLayout(new BoxLayout(boxCenter,BoxLayout.Y_AXIS));

        tLevel.setBackground(new Color(0,0,0,0));
        tExp.setBackground(new Color(0,0,0,0));
        tName.setBackground(new Color(0,0,0,0));

        //component
        JLabel name = new JLabel("Name: ");
        JLabel showName = new JLabel();
        showName.setText(player.getName());
        showName.setFont(new Font("Serif", Font.BOLD, 20));
        name.setFont(new Font("Serif", Font.BOLD, 20));
        
        JLabel level = new JLabel("Level :");
        JLabel showLevel = new JLabel();
        showLevel.setText(Integer.toString(player.getLevel()));
        level.setFont(new Font("Serif", Font.BOLD, 18));
        showLevel.setFont(new Font("Serif", Font.BOLD, 18));

        JLabel exp = new JLabel("Exp ");
        exp.setFont(new Font("Serif", Font.BOLD, 18));
        JProgressBar expBar = new JProgressBar();
        expBar.setMaximum(110);
        expBar.setMinimum(0);
        expBar.setValue(player.getExp());     
        
        JLabel myPlayer = new JLabel(new ImageIcon("img/"+player.getGenPic()));     
        
        JButton changeNameT = new JButton("Change Your Name");
        JButton bagBt = new JButton("Pokemon in Bag");
        

        //add
        tName.add(name);
        tName.add(showName);
        tLevel.add(level);
        tLevel.add(showLevel);
        tExp.add(exp);
        tExp.add(expBar);  
        
        //add box
        boxCenter.add(tName);       
        boxCenter.add(tLevel);
        boxCenter.add(tExp);
        boxCenter.add(changeNameT); 
        boxCenter.add(bagBt);         
       
        //add center
        center.add(boxCenter);
        center.add(myPlayer);      
       
        
        //left(wild pokemon)---------------------------------------------------------------------------------------------------
       
        JPanel boxLeft = new JPanel();

        JPanel jig = new JPanel();
        JPanel snor = new JPanel();
        JPanel squir = new JPanel();       
  
        //set panel        
        jig.setLayout(new BoxLayout(jig,BoxLayout.X_AXIS));
        jig.setBackground(new Color(0,0,0,0));
        
        snor.setLayout(new BoxLayout(snor,BoxLayout.X_AXIS));
        snor.setBackground(new Color(0,0,0,0));
        
        squir.setLayout(new BoxLayout(squir,BoxLayout.X_AXIS));
        squir.setBackground(new Color(0,0,0,0));
       
        boxLeft.setBackground(new Color(0,0,0,0));
        boxLeft.setLayout(new BoxLayout(boxLeft,BoxLayout.Y_AXIS));
        
        //wild
        JPanel boxW = new JPanel();
        boxW.setLayout(new BoxLayout(boxW,BoxLayout.X_AXIS));
        boxW.setBackground(new Color(0,0,0,0));
        JLabel wild = new JLabel(new ImageIcon("img/wild1.png"));

        boxW.add(wild);

        //Jig--------------------------------------------------------------------------------------   
        Jigglypuff jigglypuff = new Jigglypuff("Wild Jigglypuff");

        JPanel boxJ = new JPanel();
        boxJ.setLayout(new BoxLayout(boxJ,BoxLayout.Y_AXIS));
        boxJ.setBackground(new Color(0,0,0,0));

        //component
        JLabel j = new JLabel(new ImageIcon("img/jigglypuff.png"));
        
        JLabel name1 = new JLabel("     Name: "+ jigglypuff.getName());
        name1.setFont(new Font("Serif", Font.BOLD, 16));  
        
        JLabel type1 = new JLabel("     Type: "+ jigglypuff.getType()); 
        type1.setFont(new Font("Serif", Font.BOLD, 16));
        
        JLabel hp1 = new JLabel("     HP: " + jigglypuff.getHP());
        hp1.setFont(new Font("Serif", Font.BOLD, 16));    
        
        JButton catch1 = new JButton("CATCH");      

        //add boxJ
        boxJ.add(name1);
        boxJ.add(type1);
        boxJ.add(hp1);
        boxJ.add(catch1);

        //add jig
        jig.add(j);
        jig.add(boxJ);
        
       
        //snor---------------------------------------------------------------------------------------
        Snorlax snorlax = new Snorlax("Wild Snorlax");

        JPanel boxSn = new JPanel();
        boxSn.setLayout(new BoxLayout(boxSn,BoxLayout.Y_AXIS));
        boxSn.setBackground(new Color(0,0,0,0));

        //component
        JLabel sn = new JLabel(new ImageIcon("img/snorlax.png"));

        JLabel name2 = new JLabel("     Name: "+ snorlax.getName()); 
        name2.setFont(new Font("Serif", Font.BOLD, 16));    
        
        JLabel type2 = new JLabel("     Type: "+ snorlax.getType());   
        type2.setFont(new Font("Serif", Font.BOLD, 16));    
        
        JLabel hp2 = new JLabel("     HP: " + snorlax.getHP());
        hp2.setFont(new Font("Serif", Font.BOLD, 16));         
         
        JButton catch2 = new JButton("CATCH");        

        //add boxSn
        boxSn.add(name2);
        boxSn.add(type2);
        boxSn.add(hp2);
        boxSn.add(catch2);

        //add snor
        snor.add(sn);
        snor.add(boxSn);

        //squir-----------------------------------------------------------------------------------
        Squirtle squirtle = new Squirtle("Wild Squirtle");

        JPanel boxSq = new JPanel();
        boxSq.setLayout(new BoxLayout(boxSq,BoxLayout.Y_AXIS));
        boxSq.setBackground(new Color(0,0,0,0));

        //component
        JLabel sq = new JLabel(new ImageIcon("img/squirtle.png"));

        JLabel name3 = new JLabel("     Name: "+ squirtle.getName());
        name3.setFont(new Font("Serif", Font.BOLD, 16));           
        
        JLabel type3 = new JLabel("     Type: "+ squirtle.getType());  
        type3.setFont(new Font("Serif", Font.BOLD, 16));         
        
        JLabel hp3 = new JLabel("     HP: " + squirtle.getHP());    
        hp3.setFont(new Font("Serif", Font.BOLD, 16));             
         
        JButton catch3 = new JButton("CATCH");        

        //add boxSq
        boxSq.add(name3);
        boxSq.add(type3);
        boxSq.add(hp3);
        boxSq.add(catch3);

        //add squir
        squir.add(sq);
        squir.add(boxSq);
       
        //add boxLeft
        boxLeft.add(boxW);
        boxLeft.add(jig);
        boxLeft.add(snor);
        boxLeft.add(squir);
        
        //Add left      
        left.add(boxLeft);        
       
       
        //right(pikachu)-------------------------------------------------------------------------------------------------------
        Pikachu pikachu = new Pikachu("MyPikachu");

        //panel
        JPanel boxRight = new JPanel();

        JPanel pName = new JPanel();
        JPanel pHP = new JPanel();
        JPanel pType = new JPanel();
        
        //set panel
        boxRight.setBackground(new Color(0,0,0,0));
        boxRight.setLayout(new BoxLayout(boxRight,BoxLayout.Y_AXIS));

        pName.setBackground(new Color(0,0,0,0));
        pHP.setBackground(new Color(0,0,0,0)); 
        pType.setBackground(new Color(0,0,0,0));            
        
        //pic
        JLabel p = new JLabel(new ImageIcon("img/pikachu.png"));
        JLabel b = new JLabel(new ImageIcon("img/berry.png"));        
        JLabel my = new JLabel(new ImageIcon("img/my.png"));
       
        //name        
        JLabel name4 = new JLabel("     Name: ");
        JLabel showName4 = new JLabel();
        showName4.setText(pikachu.getName());
        showName4.setFont(new Font("Serif", Font.BOLD, 18));
        name4.setFont(new Font("Serif", Font.BOLD, 18));

        //type
        JLabel type = new JLabel("     Type: "+ pikachu.getType());
        type.setFont(new Font("Serif", Font.BOLD, 18));
        
        //hp
        JLabel hp = new JLabel("HP ");
        hp.setFont(new Font("Serif", Font.BOLD, 18));
        hp.setBackground(new Color(0,0,0,0));

        JProgressBar hpBar = new JProgressBar();
        hpBar.setMaximum(150);
        hpBar.setMinimum(0);
        hpBar.setValue(pikachu.getHP());    
        
        //button 
        JButton berry = new JButton("Eat Berry");
        JButton changeNameP = new JButton("Change Pokemon Name");

        //add
        pName.add(name4);
        pName.add(showName4);
        pType.add(type);
        pHP.add(hp);
        pHP.add(hpBar);  
        
        //add boxRight
        boxRight.add(pName); 
        boxRight.add(pType); 
        boxRight.add(pHP);
        boxRight.add(b);
        boxRight.add(berry); 
        boxRight.add(changeNameP);         
       
        //add right
        right.add(my);
        right.add(p);
        right.add(boxRight);
        

        //Add Panel to program------------------------------------------------------------------------------------------------
        
        c.add(left);
        c.add(center);
        c.add(right);
        

        //Add action --------------------------------------------------------------------------------------------------------               
        
        //center
        //change name trainer
        changeNameT.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null,"\"Input your name\"","change trainer name",JOptionPane.PLAIN_MESSAGE,null,null,null);
                if ((s != null)) {
                    showName.setText(s);
                }
        }
        });;

        //show pokemon name in bag
        bagBt.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                Bag bag = new Bag();
                
                JLabel pokemonName = new JLabel();
                pokemonName.setFont(new Font("Serif", Font.BOLD, 15));       
                String po = "Pokemon in Bag: ";
                for(Pokemon p: bag.getBag()){
                    po += p.getName() + ", " ;          
                }
                pokemonName.setText(po);
                JOptionPane.showMessageDialog(null,pokemonName);
        }
        });;

        //right
        //change name pokemon
        changeNameP.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null,"\"Input new name\"","change pokemon name",JOptionPane.PLAIN_MESSAGE,null,null,null);
                if ((s != null)) {
                    showName4.setText(s);
                }
        }
        });;

        //eat berry
        berry.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                pikachu.setHP(pikachu.getHP()+20);
                hpBar.setValue(pikachu.getHP());  
                
                player.setExp(player.getExp()+5);
                expBar.setValue(player.getExp());  

                if(player.getExp()>110){
                    player.setExp(player.getExp()-110);
                    player.Uppinglevel();
                    showLevel.setText(Integer.toString(player.getLevel()));
                    expBar.setValue(player.getExp());
                }
        }
        });;


        //left
        //catch Jigglypuff 
        catch1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                Bag bag = new Bag();
                Jigglypuff j = new Jigglypuff("MyJigglypuff");

                player.setExp(player.getExp()+20);
                expBar.setValue(player.getExp()); 

                if(pikachu.getHP() == 0){
                    JOptionPane.showMessageDialog(null,"you choose eat berry!!");
                }

                else if(pikachu.getHP() > 0){

                    for(int i=0; i<1; i++){
                        int result = (int)(Math.random() * 2);                    
                        if(result == 0){
                            JOptionPane.showMessageDialog(null,"YOU LOSE!");
                            pikachu.setHP(0);
                            hpBar.setValue(pikachu.getHP()); 
                        }                           
                        else if(result == 1){
                            JOptionPane.showMessageDialog(null,"YOU WIN! you can catch this pokemon");
                            bag.setBag(j);                            
                        }                      
                    }   
                }                
        
                if(player.getExp()>110){
                    player.setExp(player.getExp()-110);
                    player.Uppinglevel();
                    showLevel.setText(Integer.toString(player.getLevel()));
                    expBar.setValue(player.getExp());
                }
        }
        });;

        //catch Snorlax 
        catch2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                player.setExp(player.getExp()+20);
                expBar.setValue(player.getExp()); 

                if(pikachu.getHP() == 0){
                    JOptionPane.showMessageDialog(null,"you choose eat berry!!");
                }

                else if(pikachu.getHP() > 0){

                    for(int i=0; i<1; i++){
                        int result = (int)(Math.random() * 2);                    
                        if(result == 0){
                            JOptionPane.showMessageDialog(null,"YOU LOSE!");
                            pikachu.setHP(0);
                            hpBar.setValue(pikachu.getHP()); 
                        }                           
                        else if(result == 1){
                            JOptionPane.showMessageDialog(null,"YOU WIN! you can catch this pokemon");
                            
                        }                      
                    }   
                }                
        
                if(player.getExp()>110){
                    player.setExp(player.getExp()-110);
                    player.Uppinglevel();
                    showLevel.setText(Integer.toString(player.getLevel()));
                    expBar.setValue(player.getExp());
                }
        }
        });;

        //catch Squirtle
        catch3.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                player.setExp(player.getExp()+20);
                expBar.setValue(player.getExp()); 

                if(pikachu.getHP() == 0){
                    JOptionPane.showMessageDialog(null,"you choose eat berry!!");
                }

                else if(pikachu.getHP() > 0){

                    for(int i=0; i<1; i++){
                        int result = (int)(Math.random() * 2);                    
                        if(result == 0){
                            JOptionPane.showMessageDialog(null,"YOU LOSE!");
                            pikachu.setHP(0);
                            hpBar.setValue(pikachu.getHP()); 
                        }                           
                        else if(result == 1){
                            JOptionPane.showMessageDialog(null,"YOU WIN! you can catch this pokemon");
                            
                        }                      
                    }   
                }                
        
                if(player.getExp()>110){
                    player.setExp(player.getExp()-110);
                    player.Uppinglevel();
                    showLevel.setText(Integer.toString(player.getLevel()));
                    expBar.setValue(player.getExp());
                }
        }
        });;

        
        //set 
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,750);
        setVisible(true);
    }
    

}