package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class SpinnerChangeListener extends JFrame implements ChangeListener{

    private Container c;
    private JSpinner spinner;
    private Font f;
    private JLabel label;
    SpinnerChangeListener()
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
        
        SpinnerNumberModel value = new SpinnerNumberModel(0,0,500,1);
        spinner = new JSpinner(value);
        spinner.setBounds(50,30,100,50);
        spinner.setFont(f);
        c.add(spinner);
        label = new JLabel("Current value : ");
        label.setBounds(50,90,200,50);
        label.setForeground(Color.BLUE);
        label.setFont(f);
        c.add(label);
        spinner.addChangeListener(this);
    }
    
     @Override
    public void stateChanged(ChangeEvent ce) {
        String value = spinner.getValue().toString();
        int number = Integer.parseInt(value);
        label.setText("Current value : "+number);
    }
    public static void main(String[] args) {
        SpinnerChangeListener frame = new SpinnerChangeListener();
        frame.setVisible(true);
    }
 
}
