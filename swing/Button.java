package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame{
    
    private Container c;
    private JButton Loginbutton,Clearbutton,Canclebutton;
    private Font f;
    
    Button()
    {
        initial();
    }
    public void initial()
    {
        this.setTitle("Button");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,15);
        Loginbutton = new JButton("Login");
        Loginbutton.setBounds(10,100,100,50);
        Loginbutton.setFont(f);
        Loginbutton.setBackground(Color.blue);
        Loginbutton.setForeground(Color.GREEN);
        Loginbutton.setToolTipText("Login");
        c.add(Loginbutton);
        
       
        Clearbutton = new JButton("Clear");
        Clearbutton.setBounds(130,100,100,50);
        Clearbutton.setFont(f);
        Clearbutton.setBackground(Color.blue);
        Clearbutton.setForeground(Color.GREEN);
        Clearbutton.setToolTipText("Clear");
        c.add(Clearbutton);
        
        Canclebutton = new JButton("Cancle");
        Canclebutton.setBounds(270,100,100,50);
        Canclebutton.setFont(f);
        Canclebutton.setBackground(Color.blue);
        Canclebutton.setForeground(Color.GREEN);
        Canclebutton.setToolTipText("Cancle");
        c.add(Canclebutton);
        
    }

    public static void main(String[] args) {
        Button frame = new Button();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,500,500);
    }
    
}
