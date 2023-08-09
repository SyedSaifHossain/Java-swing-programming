package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label extends JFrame{
    private Container c;
    private JLabel label;
    private Font f;
   
    Label()
    {
        initial();
    }
    public void initial()
    {
        this.setTitle("Label");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        label = new JLabel("Enter your name : ");
        label.setBounds(10,10,190,50);
        label.setOpaque(true);
        label.setBackground(Color.BLACK);
        label.setForeground(Color.CYAN);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setToolTipText("Enter your name");
        label.setFont(f);
        c.add(label);
    }
    
    
    public static void main(String[] args) {
        Label frame = new Label();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,500,500);
    }
    
}

