package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame{
    
    private Container c;
    private Font f;
    private JRadioButton maleradio,femaleradio;
    private ButtonGroup btg;
    RadioButton()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,300,300);
        this.setTitle("Radio button");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        btg = new ButtonGroup();
        f = new Font("Arial",Font.BOLD,18);
        maleradio = new JRadioButton("Male");
        maleradio.setBounds(50,100,100,50);
        maleradio.setBackground(Color.GREEN);
        maleradio.setForeground(Color.CYAN);
        maleradio.setFont(f);
        maleradio.setSelected(true);
        c.add(maleradio);
        femaleradio = new JRadioButton("Female");
        femaleradio.setBounds(170,100,100,50);
        femaleradio.setBackground(Color.GREEN);
        femaleradio.setForeground(Color.CYAN);
        femaleradio.setFont(f);
        c.add(femaleradio);
        btg.add(maleradio);
        btg.add(femaleradio);
    }
    
    public static void main(String[] args) {
        RadioButton frame = new RadioButton();
        frame.setVisible(true);
    }
}

