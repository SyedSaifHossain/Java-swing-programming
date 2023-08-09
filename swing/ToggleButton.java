package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ToggleButton extends JFrame implements ActionListener{
    private Container c;
    private JLabel label;
    private JToggleButton toggle;
    private Font f;
    ToggleButton()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,300,300);
        this.setTitle("Toggle button");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        toggle = new JToggleButton("OFF");
        toggle.setBounds(100,50,100,50);
        toggle.setFont(f);
        toggle.setBackground(Color.BLACK);
        toggle.setForeground(Color.CYAN);
        c.add(toggle);
        label = new JLabel("Welcome to you");
        label.setBounds(50,110,200,50);
        label.setForeground(Color.BLUE);
        label.setFont(f);
        label.setVisible(false);
        c.add(label);
        
        toggle.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(toggle.isSelected())
        {
            toggle.setText("ON");
            label.setVisible(true);
        }
        else
        {
            toggle.setText("OFF");
            label.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        ToggleButton frame = new ToggleButton();
        frame.setVisible(true);
    }

    
}


