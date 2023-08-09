package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioListener extends JFrame{
    private Container c;
    private Font f;
    private JRadioButton maleradio,femaleradio;
    private ButtonGroup btg;
    private JTextField t;
   
    RadioListener()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,300);
        this.setTitle("Radio button listener");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        btg = new ButtonGroup();
        f = new Font("Arial",Font.BOLD,18);
        maleradio = new JRadioButton("Male");
        maleradio.setBounds(50,30,100,50);
        maleradio.setBackground(Color.GREEN);
        maleradio.setForeground(Color.CYAN);
        maleradio.setFont(f);
        c.add(maleradio);
        
        femaleradio = new JRadioButton("Female");
        femaleradio.setBounds(150,30,100,50);
        femaleradio.setBackground(Color.GREEN);
        femaleradio.setForeground(Color.CYAN);
        femaleradio.setFont(f);
        c.add(femaleradio);
        btg.add(maleradio);
        btg.add(femaleradio);
        t = new JTextField();
        t.setBounds(10,100,250,150);
        t.setBackground(Color.BLACK);
        t.setFont(f);
        t.setForeground(Color.CYAN);
        c.add(t);
        Handler handler = new Handler();
        maleradio.addActionListener(handler);
        femaleradio.addActionListener(handler);
    }
    
     class Handler implements ActionListener
     {
     public void actionPerformed(ActionEvent e)
     {
         if(e.getSource() == maleradio)
         {
             t.setText("You are male");
         }
         else
         {
             t.setText("You are female");
         }
     }
     }
     
    
     
    public static void main(String[] args) {
        RadioListener frame = new RadioListener();
        frame.setVisible(true);
    }
  
    
    
}
