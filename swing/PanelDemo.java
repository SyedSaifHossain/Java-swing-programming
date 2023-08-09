package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo extends JFrame{
    private Container c;
    private JPanel panel;
   
    PanelDemo()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);
        this.setTitle("Panel");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        panel = new JPanel();
        panel.setBounds(10,10,300,300);
        panel.setBackground(Color.GREEN);
        c.add(panel);
        
    }
    
    public static void main(String[] args) {
        PanelDemo frame = new PanelDemo();
        frame.setVisible(true);
        
    }
    
}
