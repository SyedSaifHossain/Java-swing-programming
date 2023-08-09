package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
    
private Container c;
private Font f;
private JLabel userLabel,passwordLabel;
private JTextField userText;
private JPasswordField passwordText;
private JButton loginButton,clearButton;
private Cursor cursor;
    LoginFrame()
    {
        initial();
    }
    
    public void initial()
    {
        this.setTitle("Login Frame");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        f = new Font("Arial",Font.BOLD,18);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        userLabel = new JLabel("User Name : ");
        userLabel.setBounds(10,30,150,50);
        userLabel.setForeground(Color.BLUE);
        userLabel.setFont(f);
        c.add(userLabel);
        
        userText = new JTextField();
        userText.setBounds(170,30,300,50);
        userText.setBackground(Color.BLACK);
        userText.setForeground(Color.BLUE);
        userText.setHorizontalAlignment(JTextField.CENTER);
        userText.setFont(f);
        c.add(userText);
        
        passwordLabel = new JLabel("Password : ");
        passwordLabel.setBounds(10,110,150,50);
        passwordLabel.setForeground(Color.BLUE);
        passwordLabel.setFont(f);
        c.add(passwordLabel);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(170,110,300,50);
        passwordText.setBackground(Color.BLACK);
        passwordText.setForeground(Color.BLUE);
        passwordText.setEchoChar('*');
        passwordText.setHorizontalAlignment(JTextField.CENTER);
        passwordText.setFont(f);
        c.add(passwordText);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(30,180,100,50);
        loginButton.setBackground(Color.GREEN);
        loginButton.setForeground(Color.BLUE);
        loginButton.setFont(f);
        loginButton.setCursor(cursor);
        c.add(loginButton);
        clearButton = new JButton("Clear");
        clearButton.setBounds(150,180,100,50);
        clearButton.setBackground(Color.GREEN);
        clearButton.setForeground(Color.BLUE);
        clearButton.setFont(f);
        clearButton.setCursor(cursor);
        c.add(clearButton);
        loginButton.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String name = userText.getText();
            String password = passwordText.getText();
            if(name.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"You did not enter your user name or password");
            }
            else if(password.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"You did not enter your user name or password");
            }
            else
            {
            if(name.equals("Syed Saif Hossain") && password.equals("12345"))
            {
                JOptionPane.showMessageDialog(null,"Welcome you are login successfully");
                AfterLogin frame = new AfterLogin();
                frame.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You have entered invalid user name or password");
            }
            }
        }
        });
        clearButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            userText.setText("");
            passwordText.setText("");
        }
        });
    
    }
    public static void main(String[] args) {
        LoginFrame  frame = new LoginFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,500,500);
    }
}
