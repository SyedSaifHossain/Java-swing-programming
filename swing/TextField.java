package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField extends JFrame{
    private Container c;
    private JTextField text;
    private Font f;
    
    TextField()
    {
        initial();
    }
    public void initial()
    {
        this.setTitle("Text Field");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        text = new JTextField("Enter your name");
        text.setBounds(250,10,190,50);
        text.setOpaque(true);
        text.setBackground(Color.BLACK);
        text.setForeground(Color.CYAN);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setToolTipText("Enter your name");
        text.setFont(f);
        c.add(text);
    }
    
    public static void main(String[] args) {
        TextField frame = new TextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,500,500);
    }
}
