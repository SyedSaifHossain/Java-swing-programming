package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxListener extends JFrame{
    
    private Container c;
    private Font f;                    
    private JCheckBox box_c,box_cplus,box_java;
    private ButtonGroup btg;
    private JTextField t;
    
    CheckBoxListener()
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
        box_c.setBounds(25,10,100,50);
        box_c.setBackground(Color.GREEN);
        btg.add(box_c);
        box_c.setForeground(Color.BLUE);
        c.add(box_c);
        box_cplus = new JCheckBox("C++");
        box_cplus.setBounds(25,70,100,50);
        box_cplus.setBackground(Color.GREEN);
        box_cplus.setForeground(Color.BLUE);
        btg.add(box_cplus);
        c.add(box_cplus);
        
        box_java = new JCheckBox("Java");
        box_java.setBounds(25,130,100,50);
        box_java.setBackground(Color.GREEN);
        box_java.setForeground(Color.BLUE);
        btg.add(box_java);
        c.add(box_java);
        t = new JTextField();
        t.setBounds(30,250,300,100);
        t.setBackground(Color.BLACK);
        t.setForeground(Color.CYAN);
        t.setFont(f);
        c.add(t);
        Handler handler = new Handler();
        box_c.addItemListener(handler);
        box_cplus.addItemListener(handler);
        box_java.addItemListener(handler);
    }
    class Handler implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent i) {
            if(box_c.isSelected())
            {
                t.setText("You have selected c language");
            }
            else if(box_cplus.isSelected())
            {
                t.setText("You have selected c++ language");
            }
            else
            {
                t.setText("You have selected java language");
            }
        }
        
    }
    public static void main(String[] args) {
        CheckBoxListener frame = new CheckBoxListener();
        frame.setVisible(true);
    }
    
}

