package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class mouseMotionListenerDemo extends JFrame implements MouseMotionListener{
    private Container c;
    private JTextArea a;
    private JTextField t;
    mouseMotionListenerDemo()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);
        this.setTitle("Mosuse motion listener");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        a = new JTextArea();
        a.setBounds(10,30,300,300);
        a.setBackground(Color.BLACK);
        a.setForeground(Color.CYAN);
        c.add(a);
        t = new JTextField();
        t.setBounds(330,30,150,50);
        t.setBackground(Color.BLACK);
        t.setForeground(Color.CYAN);
        c.add(t);
        a.addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent me) {
        t.setText("Mouse dragged : "+me.getX()+" "+me.getY());
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        t.setText("Mouse moved : "+me.getX()+" "+me.getY());
    }
    public static void main(String[] args) {
        mouseMotionListenerDemo frame = new mouseMotionListenerDemo();
        frame.setVisible(true);
    }
    
}

