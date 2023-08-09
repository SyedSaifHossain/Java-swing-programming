package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox extends JFrame{
    
    private Container c;
    private Font f;                    
    private JCheckBox box_c,box_cplus,box_java;
    private ButtonGroup btg;
    
    CheckBox()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);
        this.setTitle("Check Box");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        btg = new ButtonGroup();
        box_c = new JCheckBox("C");
        box_c.setBounds(25,30,100,50);
        box_c.setSelected(true);
        box_c.setBackground(Color.GREEN);
        btg.add(box_c);
        box_c.setForeground(Color.BLUE);
        c.add(box_c);
        box_cplus = new JCheckBox("C++");
        box_cplus.setBounds(25,90,100,50);
        box_cplus.setBackground(Color.GREEN);
        box_cplus.setForeground(Color.BLUE);
        btg.add(box_cplus);
        c.add(box_cplus);
        
        box_java = new JCheckBox("Java");
        box_java.setBounds(25,150,100,50);
        box_java.setBackground(Color.GREEN);
        box_java.setForeground(Color.BLUE);
        btg.add(box_java);
        c.add(box_java);
    }
    
    public static void main(String[] args) {
        CheckBox frame = new CheckBox();
        frame.setVisible(true);
    }
    
}

