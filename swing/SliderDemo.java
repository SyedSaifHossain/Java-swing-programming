package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderDemo extends JFrame{
    private Container c;
    private JSlider slider;
    SliderDemo()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,300);
        this.setTitle("Slider demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        slider = new JSlider(0,50,0);
        slider.setBounds(30,50,400,50);
        slider.setBackground(Color.GREEN);
        slider.setForeground(Color.BLACK);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);
    }
    
    
    public static void main(String[] args) {
        SliderDemo frame = new SliderDemo();
        frame.setVisible(true);
    }
}
