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

         //background-----------------------------------------------------------------------
         ImageIcon bgImg = new ImageIcon("img/bg.jpg");
         JLabel bgLeble = new JLabel("", bgImg, JLabel.CENTER);
         bgLeble.setBounds(0, 0, 1000, 750);
         setContentPane(bgLeble);
         Container c = getContentPane();        
         
         c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));

        
        //pokemons
        Jigglypuff jigglypuff = new Jigglypuff("Wild Jigglypuff");
        Snorlax snorlax = new Snorlax("Wild Snorlax");
        Squirtle squirtle = new Squirtle("Wild Squirtle");


       
        JPanel left = new JPanel();
        JPanel center = new JPanel();
        JPanel right = new JPanel();
       

        //set panel------------------------------------------------------------------------------------------------------

        left.setLayout(new BoxLayout(left,BoxLayout.Y_AXIS));
        left.setBackground(new Color(0,0,0,0));        

        right.setLayout(new BoxLayout(right,BoxLayout.Y_AXIS));
        right.setBackground(new Color(0,0,0,0));
        

        center.setLayout(new BoxLayout(center,BoxLayout.Y_AXIS));
        center.setBackground(new Color(0,0,0,0));

     


        //Center--------------------------------------------------------------------------------------------------------------

        JPanel boxCenter = new JPanel();

        JPanel tLevel = new JPanel();
        JPanel tExp = new JPanel();
        JPanel tName = new JPanel();

        boxCenter.setBackground(new Color(0,0,0,0));
        boxCenter.setLayout(new BoxLayout(boxCenter,BoxLayout.Y_AXIS));

        tLevel.setBackground(new Color(0,0,0,0));
        tExp.setBackground(new Color(0,0,0,0));
        tName.setBackground(new Color(0,0,0,0));

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
        
        JButton changeName = new JButton("Change Name");
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
        boxCenter.add(changeName); 
        boxCenter.add(bagBt); 
        
       
        //add center
        center.add(boxCenter);
        center.add(myPlayer);
      
       
        
        //left-----------------------------------------------------------------------------------------------------------------
       

        JPanel pic1 = new JPanel();
        JPanel pic2 = new JPanel();
        JPanel pic3 = new JPanel();
       
  
        //set panel
        pic1.setLayout(new BorderLayout(0,0));
        pic1.setLayout(new BoxLayout(pic1,BoxLayout.X_AXIS));
        pic1.setBackground(new Color(0,0,0,0));

        pic2.setLayout(new BorderLayout(0,0));
        pic2.setLayout(new BoxLayout(pic2,BoxLayout.X_AXIS));
        pic2.setBackground(new Color(0,0,0,0));

        pic3.setLayout(new BorderLayout(0,0));
        pic3.setLayout(new BoxLayout(pic3,BoxLayout.X_AXIS));
        pic3.setBackground(new Color(0,0,0,0));
       
        

        //pic1-----------------------------------------------------------

        JLabel wild = new JLabel(new ImageIcon("img/wild.png"));

        JPanel boxJ = new JPanel();
        boxJ.setLayout(new BoxLayout(boxJ,BoxLayout.Y_AXIS));
        boxJ.setBackground(new Color(0,0,0,0));

        JLabel j = new JLabel(new ImageIcon("img/jigglypuff.png"));

        //name
        JLabel name1 = new JLabel("     Name: "+ jigglypuff.getName());  
        //type
        JLabel type1 = new JLabel("     Type: "+ jigglypuff.getType());  
        //hp
        JLabel hp1 = new JLabel("     HP: " + jigglypuff.getHP());        
        //button 
        JButton catch1 = new JButton("catch");      

        //add boxJ
        boxJ.add(name1);
        boxJ.add(type1);
        boxJ.add(hp1);
        boxJ.add(catch1);

        //add pic1
        pic1.add(j);
        pic1.add(boxJ);
        
       
        //pic2-----------------------------------------------------------------------------

        JPanel boxSn = new JPanel();
        boxSn.setLayout(new BoxLayout(boxSn,BoxLayout.Y_AXIS));
        boxSn.setBackground(new Color(0,0,0,0));

        JLabel sn = new JLabel(new ImageIcon("img/snorlax.png"));

        //name
        JLabel name2 = new JLabel("     Name: "+ snorlax.getName()); 
        //type
        JLabel type2 = new JLabel("     Type: "+ snorlax.getType());   
        //hp
        JLabel hp2 = new JLabel("     HP: " + snorlax.getHP());        
        //button 
        JButton catch2 = new JButton("catch");        

        //add boxSn
        boxSn.add(name2);
        boxSn.add(type2);
        boxSn.add(hp2);
        boxSn.add(catch2);

        //add pic2
        pic2.add(sn);
        pic2.add(boxSn);

        //pic3----------------------------------------------------------------------

        JPanel boxSq = new JPanel();
        boxSq.setLayout(new BoxLayout(boxSq,BoxLayout.Y_AXIS));
        boxSq.setBackground(new Color(0,0,0,0));


        JLabel sq = new JLabel(new ImageIcon("img/squirtle.png"));

        //name
        JLabel name3 = new JLabel("     Name: "+ squirtle.getName());  
        //type
        JLabel type3 = new JLabel("     Type: "+ squirtle.getType());  
        //hp
        JLabel hp3 = new JLabel("     HP: " + squirtle.getHP());        
        //button 
        JButton catch3 = new JButton("catch");        

        //add boxSq
        boxSq.add(name3);
        boxSq.add(type3);
        boxSq.add(hp3);
        boxSq.add(catch3);

        //add pic3
        pic3.add(sq);
        pic3.add(boxSq);
       
        
        //Add left-------------------------------------------------------        
        //left.add(wild);
        left.add(pic1);
        left.add(pic2);
        left.add(pic3);
        
       
       
        //right---------------------------------------------------------------------------------------------------------------

        //pikachu--------------------------------------------------------

        Pikachu pikachu = new Pikachu("MyPikachu");

        //panel

        JPanel boxRight = new JPanel();

        JPanel pName = new JPanel();
        JPanel pHP = new JPanel();
        JPanel pType = new JPanel();
        
        boxRight.setBackground(new Color(0,0,0,0));
        boxRight.setLayout(new BoxLayout(boxRight,BoxLayout.Y_AXIS));

        pName.setBackground(new Color(0,0,0,0));
        pHP.setBackground(new Color(0,0,0,0)); 
        pType.setBackground(new Color(0,0,0,0));            
        
        //pic
        JLabel p = new JLabel(new ImageIcon("img/pikachu.png"));
        JLabel my = new JLabel(new ImageIcon("img/my.png"));
        JLabel b = new JLabel(new ImageIcon("img/berry.png"));

        //name        
        JLabel name4 = new JLabel("     Name: ");
        JLabel showName4 = new JLabel();
        showName4.setText(pikachu.getName());
        showName4.setFont(new Font("Serif", Font.BOLD, 15));
        name4.setFont(new Font("Serif", Font.BOLD, 15));

        //type
        JLabel type = new JLabel("     Type: "+ pikachu.getType());
        type.setFont(new Font("Serif", Font.BOLD, 15));
        
        //hp
        JLabel hp = new JLabel("HP ");
        hp.setFont(new Font("Serif", Font.BOLD, 15));
        hp.setBackground(new Color(0,0,0,0));

        JProgressBar hpBar = new JProgressBar();
        hpBar.setMaximum(150);
        hpBar.setMinimum(0);
        hpBar.setValue(pikachu.getHP());    
        
        //button 
        JButton berry = new JButton("eat berry");
        JButton rename = new JButton("Change name");

        //add
        pName.add(name4);
        pName.add(showName4);
        pType.add(type);
        pHP.add(hp);
        pHP.add(hpBar);  
        
        //add box
        boxRight.add(pName); 
        boxRight.add(pType); 
        boxRight.add(pHP);
        boxRight.add(b);
        boxRight.add(berry); 
        boxRight.add(rename); 
        
       
        //add right
        right.add(my);
        right.add(p);
        right.add(boxRight);
        

        //Add Panel to program------------------------------------------------------------------------------------------------
        
        c.add(left);
        c.add(center);
        c.add(right);
        
        //Add action --------------------------------------------------------------------------------------------------------

                
        
        changeName.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null,"\"Input your name\"","change trainer name",JOptionPane.PLAIN_MESSAGE,null,null,null);
                if ((s != null)) {
                    showName.setText(s);
                }
        }
        });;

        bagBt.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                
                JLabel pokemonName= new JLabel();
                pokemonName.setFont(new Font("Serif", Font.BOLD, 15));       
                String po = "Pokemon in Bag: ";
                for(Pokemon p: player.getBag()){
                    po += p.getName() + ", " ;          
                }
                pokemonName.setText(po);
                JOptionPane.showMessageDialog(null,pokemonName);
        }
        });;

       
        

        rename.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null,"\"Input new name\"","change pokemon name",JOptionPane.PLAIN_MESSAGE,null,null,null);
                if ((s != null)) {
                    showName4.setText(s);
                }
        }
        });;

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

        catch1.addActionListener(new ActionListener(){

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


        

        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,750);
        setVisible(true);
    }
    

}