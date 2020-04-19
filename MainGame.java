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
    
    JLabel n;
    JTextField f;
    JButton b1;
    JButton b2;
    JButton b3;

    public static void main(String args[]) {      
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainGame main = new MainGame(); 
                    main.setVisible(true);
                    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    main.setSize(900,700);                
                    main.setResizable(false);
                    main.setLocationRelativeTo(null);     
                }
                catch (Exception e) {
                    e.printStackTrace();
                }                
            }
        });       
    }
     
    public MainGame(){

        super("Choose Trainer");

       
        //background---------------------------------------------------------------------------------------
        ImageIcon bgImg = new ImageIcon("img/bg1.jpg");
        JLabel bgLeble = new JLabel("", bgImg, JLabel.CENTER);
        bgLeble.setBounds(0, 0, 900, 700);

        setContentPane(bgLeble);
        Container c = getContentPane();   
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
       

        //logo---------------------------------------------------------------------------------------------
        JPanel logo = new JPanel();
        JLabel showLogo = new JLabel(new ImageIcon("img/logo.png"));
        logo.setBackground(new Color(0,0,0,0));

        logo.add(showLogo);


        //Set name-----------------------------------------------------------------------------------------

        JPanel inputName = new JPanel();
        inputName.setBackground(new Color(0,0,0,0));    

        n = new JLabel("Enter Your Name : ");
        f = new JTextField(20);
        
        inputName.add(n);
        inputName.add(f);


        //Panel gender------------------------------------------------------------------------------------- 
        JPanel gender = new JPanel();
        gender.setLayout(new BoxLayout(gender,BoxLayout.X_AXIS));
        gender.setBackground(new Color(0,0,0,0));
        

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

        //add-------------------------------------------------------------------------------------------------
        //add gender
        gender.add(male);
        gender.add(female);
        
       //add c
        c.add(logo);
        c.add(inputName);
        c.add(gender);      
        

        //set button----------------------------------------------------------------------------------------
        ClickListerner click = new ClickListerner();
        b1.addActionListener(click);
        b2.addActionListener(click);
 
    }    

        public class ClickListerner implements ActionListener{

            public void actionPerformed(ActionEvent e){
                if(e.getSource() == b1){
                    Player p1 = new Male(f.getText());
                    dispose();
                    new InterfacePlay(p1);
                }
                if(e.getSource() == b2){
                    Player p1 = new Female(f.getText());
                    dispose();
                    new InterfacePlay(p1);
                }               
            }       

        }
}


 