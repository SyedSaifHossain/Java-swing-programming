package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane extends JFrame{
    private Container c;
    private JPanel panel1,panel2,panel3;
    private JTabbedPane tab;
    private JLabel label1,label2,label3;
    
    TabbedPane()
    {
        initial();
    }
    
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Tabbed pane");
          
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        tab = new JTabbedPane();
        tab.setBounds(50,50,300,300);
        c.add(tab);
        panel1 = new JPanel();
        panel1.setBackground(Color.GREEN);
        
        label1 = new JLabel("This is panel number one");
        panel1.add(label1);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        
        label2 = new JLabel("This is panel number two");
        panel2.add(label2);
  
        panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        
        label3 = new JLabel("This is panel number three");
        panel3.add(label3);
       
        tab.addTab("Green",panel1);
        tab.addTab("Red",panel2);
        tab.addTab("Blue",panel3);
        
    }
    
    
    public static void main(String[] args) {
        TabbedPane frame = new TabbedPane();
        frame.setVisible(true);
    }
}
