package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame{
    private FlowLayout flow;
    private Container c;
    private JButton button[];
    FlowLayoutDemo()
    {
        initial();
    }
    
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,300);
        this.setTitle("Flow Layout Demo");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        flow = new FlowLayout(FlowLayout.CENTER);
        flow.setHgap(15);
        flow.setVgap(15);
        c.setLayout(flow);
        button = new JButton[9];
        int i;
        for(i=0; i<9; i++)
        {
            button[i] = new JButton(""+(i+1));
            c.add(button[i]);
        }
    }
    
    
    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
    }
}
