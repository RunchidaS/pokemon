import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainGame extends JFrame{

    
    

   
    // private JPanel gameMenuPanel;
    // private JButton catchBt;
    // private JButton statusBt;
    // private JButton playerBt;

    JLabel l1;
    JTextField f1;
    JButton b1;
    JButton b2;
    JButton b3;
   


    public static void main(String args[]) {        
       
        new MainGame();
       
    }

     
    public MainGame(){

        super("Choose Character");

       
        //background-----------------------------------------------------------------------
        ImageIcon bgImg = new ImageIcon("img/bg.jpg");
        JLabel bgLeble = new JLabel("", bgImg, JLabel.CENTER);
        bgLeble.setBounds(0, 0, 1000, 750);
        setContentPane(bgLeble);
        Container c = getContentPane();       
        
        
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        //logo
        JPanel logo = new JPanel();
        JLabel showLogo = new JLabel(new ImageIcon("img/logo.png"));
        logo.setBackground(new Color(0,0,0,0));

        logo.add(showLogo);


        //Set name

        JPanel inputName = new JPanel();
        inputName.setBackground(new Color(0,0,0,0));    

        l1 = new JLabel("Enter your Name : ");
        f1 = new JTextField(20);

        
        inputName.add(l1);
        inputName.add(f1);


        //Panel gender 
        JPanel setGender = new JPanel();
        setGender.setLayout(new BoxLayout(setGender,BoxLayout.X_AXIS));
        setGender.setBackground(new Color(0,0,0,0));
        

        //male
        JPanel male = new JPanel();
        male.setLayout(new BoxLayout(male,BoxLayout.Y_AXIS));
        male.setBackground(new Color(0,0,0,0));

        JPanel picMaleBox = new JPanel();
        JLabel picMale = new JLabel(new ImageIcon("img/male.png"));
        picMaleBox.setBackground(new Color(0,0,0,0));

        JPanel button1 = new JPanel();
        b1 = new JButton("Male Trainer");
        button1.setBackground(new Color(0,0,0,0));
        
        picMaleBox.add(picMale);
        button1.add(b1);
        
        male.add(button1);
        male.add(picMaleBox);
        

        //female
        JPanel female = new JPanel();
        female.setLayout(new BoxLayout(female, BoxLayout.Y_AXIS));
        female.setBackground(new Color(0,0,0,0));
        
        JPanel picFemaleBox = new JPanel();
        JLabel picFemale = new JLabel(new ImageIcon("img/female.png"));
        picFemaleBox.setBackground(new Color(0,0,0,0));
        
        JPanel button2 = new JPanel();
        b2 = new JButton("Female Trainer");
        button2.setBackground(new Color(0,0,0,0));
        
        picFemaleBox.add(picFemale);
        button2.add(b2);

        female.add(button2);
        female.add(picFemaleBox);
        
        

        

        //set gender
        setGender.add(male);
        setGender.add(female);

        
       //set c
        c.add(logo);
        c.add(inputName);
        c.add(setGender);      
        

        //
        ClickListerner click = new ClickListerner();
        b1.addActionListener(click);
        b2.addActionListener(click);
        

        //set

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,700);     
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);       
       
            
    }    

        public class ClickListerner implements ActionListener{

            public void actionPerformed(ActionEvent e){
                if(e.getSource() == b1){
                    Player p1 = new Male(f1.getText());
                    dispose();
                    new InterfacePlay(p1);
                }
                if(e.getSource() == b2){
                    Player p1 = new Female(f1.getText());
                    dispose();
                    new InterfacePlay(p1);
                }               
            }


            


        // gameMenuPanel = new JPanel();
        // gameMenuPanel.setLayout(new BoxLayout(gameMenuPanel,BoxLayout.Y_AXIS));
        // gameMenuPanel.setBackground(new Color(255,255,255,0));
        // gameMenuPanel.setBounds(420, 200, 250, 120);
        

        // //Menu game play button

        // playerBt = new JButton("Trainer Status");
        // playerBt.setAlignmentX(CENTER_ALIGNMENT);
        // playerBt.setFont(new Font("Serif", Font.BOLD, 20));
        // playerBt.setForeground(Color.BLACK);

        // catchBt = new JButton("Catch Pokemon!!");
        // catchBt.setAlignmentX(CENTER_ALIGNMENT);
        // catchBt.setFont(new Font("Serif", Font.BOLD, 20));
        // catchBt.setForeground(Color.BLACK);

        // statusBt = new JButton("Status Pokemon in Bag");
        // statusBt.setAlignmentX(CENTER_ALIGNMENT);
        // statusBt.setFont(new Font("Serif", Font.BOLD, 20));
        // statusBt.setForeground(Color.BLACK);


        // playerBt.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
                
        //         new TrainerStatus(trainer);                 
            
        //     }
        // });

        // catchBt.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
                
        //         new ChoosePokemon(trainer);                 
            
        //     }
        // });

        // statusBt.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        
        //             new PokemonStatus(trainer.getBag().get(0));                  
 
        //     }
        // });

        // gameMenuPanel.add(playerBt);
        // gameMenuPanel.add(catchBt);
        // gameMenuPanel.add(statusBt);
       

        // c.add(gameMenuPanel);          

        

        }

}


 