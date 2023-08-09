package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea extends JFrame{
       
    private Container c;
    private JTextArea t;
    private Font f;
    
    TextArea()
    {
        initial();
    }
    public void initial()
    {
        this.setTitle("Text Area");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        t = new JTextArea();
        t.setBounds(10,100,300,300);
        t.setBackground(Color.ORANGE);
        t.setLineWrap(true);
        t.setWrapStyleWord(true);
        t.setFont(f);
        c.add(t);
    }
    
    public static void main(String[] args) {
        
    
        TextArea frame = new TextArea();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,500,500);
    }
}
