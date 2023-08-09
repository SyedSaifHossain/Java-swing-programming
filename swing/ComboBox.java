package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame{
    
    private Container c;
    private Font f;
    private JComboBox combo;
    private String[] language={"C","C++","Java","Python","PHP"};
    ComboBox()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);
        this.setTitle("Combo box");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        combo = new JComboBox(language);
        combo.setBounds(50,50,100,100);
        combo.setBackground(Color.GREEN);
        combo.setForeground(Color.BLUE);
        combo.setEditable(true);
        c.add(combo);
    }
    
    public static void main(String[] args) {
        ComboBox frame = new ComboBox();
        frame.setVisible(true);
    }
}
