package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorChoose extends JFrame implements ActionListener{
    private Container c;
    private JLabel label;
    private Font f;
    private JButton button;
    ColorChoose()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Select a color");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        f = new Font("Arial",Font.BOLD,18);
        
        button = new JButton("Choose a color");
        button.setBounds(100,100,300,50);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.CYAN);
        button.setFont(f);
        c.add(button);
        
        label = new JLabel("You have Selected a color");
        label.setBounds(50,170,250,50);
        label.setForeground(Color.BLACK);
        label.setFont(f);
        label.setVisible(false);
        c.add(label);
        button.addActionListener(this);
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
        
            Color color = JColorChooser.showDialog(null,"Choose a color",Color.YELLOW);
            c.setBackground(color);
            label.setVisible(true);
    }
    
    public static void main(String[] args) {
        ColorChoose frame = new ColorChoose();
        frame.setVisible(true);
    }

   
}
