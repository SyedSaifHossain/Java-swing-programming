package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeListener extends JFrame implements ChangeListener{
    private Container c;
    private JSlider RedSlider,GreenSlider,BlueSlider;
    private JLabel redl,greenl,bluel,preview;
    private JPanel panel;
    private JTextField RedText,GreenText,BlueText;
    private Font f;
    SliderChangeListener()
    {
        initial();
    }
    
    
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,800,350);
        this.setTitle("Slider demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        
        redl = new JLabel("RED : ");
        redl.setBounds(20,30,100,50);
        redl.setFont(f);
        c.add(redl);
        RedSlider = new JSlider(0,255,0);
        RedSlider.setBounds(110,30,300,50);
        RedSlider.setBackground(Color.GREEN);
        RedSlider.setForeground(Color.BLACK);
        c.add(RedSlider);
        RedText = new JTextField();
        RedText.setBounds(425,30,90,50);
        RedText.setHorizontalAlignment(JTextField.CENTER);
        RedText.setBackground(Color.BLACK);
        RedText.setForeground(Color.CYAN);
        RedText.setFont(f);
        c.add(RedText);
        
        greenl = new JLabel("GREEN : ");
        greenl.setBounds(20,100,100,50);
        greenl.setFont(f);
        c.add(greenl);
        GreenSlider = new JSlider(0,255,0);
        GreenSlider.setBounds(110,100,300,50);
        GreenSlider.setBackground(Color.GREEN);
        GreenSlider.setForeground(Color.BLACK);
        c.add(GreenSlider);
        GreenText = new JTextField();
        GreenText.setBounds(425,100,90,50);
        GreenText.setHorizontalAlignment(JTextField.CENTER);
        GreenText.setBackground(Color.BLACK);
        GreenText.setForeground(Color.CYAN);
        GreenText.setFont(f);
        c.add(GreenText);
        
        bluel = new JLabel("BLUE : ");
        bluel.setBounds(20,170,100,50);
        bluel.setFont(f);
        c.add(bluel);
        BlueSlider = new JSlider(0,255,0);
        BlueSlider.setBounds(110,170,300,50);
        BlueSlider.setBackground(Color.GREEN);
        BlueSlider.setForeground(Color.BLACK);
        c.add(BlueSlider);
        BlueText = new JTextField();
        BlueText.setBounds(425,170,90,50);
        BlueText.setHorizontalAlignment(JTextField.CENTER);
        BlueText.setBackground(Color.BLACK);
        BlueText.setForeground(Color.CYAN);
        BlueText.setFont(f);
        c.add(BlueText);
        
        panel = new JPanel();
        panel.setBounds(545,30,190,190);
        panel.setBackground(Color.BLACK);
        c.add(panel);
        preview = new JLabel("Preview");
        preview.setBounds(610,220,130,50);
        preview.setForeground(Color.BLUE);
        preview.setFont(f);
        c.add(preview);
        
        
        RedSlider.addChangeListener(this);
        GreenSlider.addChangeListener(this);
        BlueSlider.addChangeListener(this);
    }
    
    
     @Override
     public void stateChanged(ChangeEvent ce) {
        int redValue = RedSlider.getValue();
        int greenValue = GreenSlider.getValue();
        int blueValue = BlueSlider.getValue();
        RedText.setText(""+redValue);
        GreenText.setText(""+greenValue);
        BlueText.setText(""+blueValue);
        Color color = new Color(redValue,greenValue,blueValue);
        panel.setBackground(color);
    }

    public static void main(String[] args) {
        SliderChangeListener frame = new SliderChangeListener();
        frame.setVisible(true);
    }

}



