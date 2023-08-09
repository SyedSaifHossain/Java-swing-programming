package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
public class SpinnerSetLimit extends JFrame{

    private Container c;
    private JSpinner spinner;
    private Font f;
    SpinnerSetLimit()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,300,300);
        this.setTitle("Spinner Layout");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        
        SpinnerNumberModel value = new SpinnerNumberModel(1,0,50,1);
        spinner = new JSpinner(value);
        spinner.setBounds(100,100,100,50);
        spinner.setFont(f);
        c.add(spinner);
    }
    
    public static void main(String[] args) {
        SpinnerSetLimit frame = new SpinnerSetLimit();
        frame.setVisible(true);
    }
}
