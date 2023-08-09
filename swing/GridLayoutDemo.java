package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{
    private Container c;
    private GridLayout grid;
    private JButton button[];
    
    GridLayoutDemo()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,300);
        this.setTitle("Grid layout demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        grid = new GridLayout(3,3,10,10);
        c.setLayout(grid);
        button = new JButton[9];
        int i;
        
        for(i=0; i<9; i++)
        {
            button[i] = new JButton(""+(i+1));
            c.add(button[i]);
        }
    }
    
    public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
        frame.setVisible(true);
    }
}

