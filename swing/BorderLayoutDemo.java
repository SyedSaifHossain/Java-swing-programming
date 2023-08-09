package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame{
    private Container c;
    private BorderLayout bLayout;
    private JButton North,West,South,East,Center;
   BorderLayoutDemo()
   {
       initial();
   }
   public void initial()
   {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,100,500,500);
       this.setTitle("Border layout Demo");
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.GREEN);
       bLayout = new BorderLayout();
       bLayout.setHgap(10);
       bLayout.setVgap(10);
       c.setLayout(bLayout);
       North = new JButton("North");
       West = new JButton("West");
       Center = new JButton("Center");
       East = new JButton("East");
       South = new JButton("South");
       
       c.add(North,BorderLayout.NORTH);
       c.add(West,BorderLayout.WEST);
       c.add(Center,BorderLayout.CENTER);
       c.add(East,BorderLayout.EAST);
       c.add(South,BorderLayout.SOUTH);
       
       
   }
    
    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
    }
}
