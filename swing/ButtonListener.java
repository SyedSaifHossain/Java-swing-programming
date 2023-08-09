package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener extends JFrame implements ActionListener{
    
    private Container c;
    private JButton green,red,blue;
    private Font f;
    
    ButtonListener()
    {
        initial();
    }
    public void initial()
    {
        this.setTitle("Button Action Listener");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        f = new Font("Arial",Font.BOLD,15);
        green = new JButton("Green");
        green.setBounds(10,100,100,50);
        green.setFont(f);
        green.setBackground(Color.BLACK);
        green.setForeground(Color.GREEN);
        green.setToolTipText("Green");
        c.add(green);
        
       
        red = new JButton("Red");
        red.setBounds(130,100,100,50);
        red.setFont(f);
        red.setBackground(Color.BLACK);
        red.setForeground(Color.RED);
        red.setToolTipText("Red");
        c.add(red);
        
        blue = new JButton("Blue");
        blue.setBounds(270,100,100,50);
        blue.setFont(f);
        blue.setBackground(Color.BLACK);
        blue.setForeground(Color.BLUE);
        blue.setToolTipText("Blue");
        c.add(blue);
        green.addActionListener(this);
        red.addActionListener(this);
        blue.addActionListener(this);
        
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == green)
        {
            c.setBackground(Color.GREEN);
        }
        else if(e.getSource() == red)
        {
            c.setBackground(Color.RED);
        }
        else if(e.getSource() == blue)
        {
            c.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        ButtonListener frame = new ButtonListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,500,500);
    }

    
    
}
