package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollBar extends JFrame{
    private Container c;
    private Font f;
    private JTextArea a;
    private JScrollPane scroll;

    ScrollBar()
    {
        initial();
    }
    
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,500,500);
        this.setTitle("Scroll Bar");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f = new Font("Arial",Font.BOLD,18);
        a = new JTextArea();
        a.setBackground(Color.ORANGE);
        a.setLineWrap(true);
        a.setWrapStyleWord(true);
        a.setFont(f);
        scroll = new JScrollPane(a,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(50,50,300,300);
        c.add(scroll);
       
    }
    
    
    
    public static void main(String[] args) {
        ScrollBar frame = new ScrollBar();
        frame.setVisible(true);
    }
}
