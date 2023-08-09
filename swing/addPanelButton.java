package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class addPanelButton extends JFrame{
    
    private Container c;
    private JPanel panel;
    private JButton button[];
    private FlowLayout flow;
    private JLabel label;
   
    addPanelButton()
    {
        initial();
    }
    
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);
        this.setTitle("Panel button");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        panel = new JPanel();
        panel.setBounds(85,85,200,200);
        panel.setBackground(Color.GREEN);
        c.add(panel);
        flow = new FlowLayout(FlowLayout.CENTER);
        flow.setHgap(10);
        flow.setVgap(10);
        panel.setLayout(flow);
        
        label = new JLabel("This is panel");
        label.setBounds(150,35,150,50);
        label.setForeground(Color.CYAN);
        c.add(label);
        button = new JButton[9];
        
        int i;
        
        for(i=0; i<9; i++)
        {
            button[i] = new JButton(""+(i+1));
            panel.add(button[i]);
        }
    }
    
    public static void main(String[] args) {
        addPanelButton frame = new addPanelButton();
        frame.setVisible(true);
        
    }
    
}

