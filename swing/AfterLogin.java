package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AfterLogin extends JFrame{
    
    private Container c;
    private JLabel l;
    private Font f;
 
    
    AfterLogin()
    {
        this.setTitle("New Frame");
        this.setBounds(700,100,300,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        f = new Font("Arial",Font.BOLD,18);
        l = new JLabel("Welcome to the new frame");
        l.setBounds(15,100,300,50);
        l.setFont(f);
        l.setForeground(Color.CYAN);
        c.add(l);
    }
    public static void main(String[] args) {
        AfterLogin frame = new AfterLogin();
        frame.setVisible(true);
        
    }
    
}