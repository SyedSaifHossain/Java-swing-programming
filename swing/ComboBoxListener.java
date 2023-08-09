package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxListener extends JFrame{
    
    private Container c;
    private Font f;
    private JComboBox combo;
    private String[] language={"C","C++","Java","Python","PHP"};
    private JLabel label;
    ComboBoxListener()
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
        combo.setBounds(10,50,100,100);
        combo.setBackground(Color.GREEN);
        combo.setForeground(Color.BLUE);
        combo.setEditable(true);
        c.add(combo);
        label = new JLabel();
        label.setBounds(170,50,300,50);
        label.setFont(f);
        label.setForeground(Color.BLACK);
        c.add(label);
        
        combo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s = combo.getSelectedItem().toString();
                label.setText("You have Selected : "+s);
            }
        
        });
    }
    
    public static void main(String[] args) {
        ComboBoxListener frame = new ComboBoxListener();
        frame.setVisible(true);
    }
}
