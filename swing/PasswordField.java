package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordField extends JFrame{
    
    private Container c;
    private JPasswordField password;
    private Font f;
    
    PasswordField()
    {
        initial();
    }
    public void initial()
    {
        this.setTitle("Password Field");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        password = new JPasswordField();
        password.setBounds(100,300,150,50);
        password.setBackground(Color.ORANGE);
        password.setFont(f);
        password.setForeground(Color.CYAN);
        password.setEchoChar('*');
        c.add(password);
    }
    public static void main(String[] args) {
        PasswordField frame = new PasswordField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,500,500);
    }
}
