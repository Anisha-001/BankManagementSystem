import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton signUp, clear, login;  // we have to define globally to access these buttons 
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
         setLayout(null);  // by default this set as center so we have to null for creating own layout
        setTitle("AUTOMATED TELLER MACHINE");  // for setting title 
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        // you cannot place a image directly on frame , you have to pass JLabel.
        Image logo2 = logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo3 = new ImageIcon(logo2);
        JLabel label= new JLabel(logo3); 
        label.setBounds(70,10,100,100); // setBounds ka use logo yaa image ko kahi bhi fix krne liye 
        add(label);
        getContentPane().setBackground(Color.white);  // getContentPane used for selecting all layout 
         
        JLabel text = new JLabel("Welcome to ATM");
        add(text);
        // now if you run now you will get nothing cuz you have nullify the setLayout
        // so you have to do setBounds for where you want to keep
        text.setFont(new Font("Osward", Font.BOLD  , 38)); 
        text.setBounds(200, 40, 310, 40);

        JLabel cardNo = new JLabel("Card No:");
        add(cardNo);
        // now if you run now you will get nothing cuz you have nullify the setLayout
        // so you have to do setBounds for where you want to keep
        cardNo.setFont(new Font("Raleway", Font.BOLD  , 24)); 
        cardNo.setBounds(120, 150, 150, 30);

         cardTextField = new JTextField();
        cardTextField.setBounds(230, 150, 210, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);


        JLabel pin = new JLabel("PIN:");
        add(pin);
        // now if you run now you will get nothing cuz you have nullify the setLayout
        // so you have to do setBounds for where you want to keep
        pin.setFont(new Font("Raleway", Font.BOLD  , 24)); 
        pin.setBounds(120, 200, 200, 30);

         pinTextField = new JPasswordField();  // used for text field
        pinTextField.setBounds(230, 200, 210, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));

        add(pinTextField);

        // now have to make buttons 

         login = new JButton("SIGN IN");
        login.setBounds(230, 250, 90, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);  // font color
        login.addActionListener(this); // for action perform
         add(login);

         clear = new JButton("CLEAR");
        clear.setBounds(350, 250, 90, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);

        add(clear);

         signUp = new JButton("SIGN UP");
        signUp.setBounds(230, 300, 210, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);

        add(signUp);

        setSize(800,480);  // size of window
        setVisible(true);  // initially frame sets to false so we use setVisible and enable the window
        setLocation(300 , 150);  // setLocation basically allows where window should popup. it is based x,y axis.
    }
     
    // this is for override the contructor to perform interface 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");   // if you type anything in " " it will show in textField
            pinTextField.setText("");  // and if you dont type anything when we tap on clear button it will show nothing
        }
        else if(ae.getSource() == signUp){
            setVisible(false);
            new SignUpOne().setVisible(true);

        }
        else if(ae.getSource()== login){

        }
    }

    public static void main(String args[]){
        new Login(); // calling the constructor
    }
}
