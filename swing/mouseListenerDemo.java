package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class mouseListenerDemo extends JFrame implements MouseListener{
    
    private Container c;
    private Font f;
    private JTextField t;
    private JTextArea a;
    private JScrollPane scroll;
    mouseListenerDemo()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,300,500);
        this.setTitle("Key listener");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        t = new JTextField();
        t.setBackground(Color.ORANGE);
        t.setForeground(Color.CYAN);
        t.setFont(f);
        t.setBounds(10,10,250,50);
        c.add(t);
        
        a = new JTextArea();
        a.setBackground(Color.ORANGE);
        a.setFont(f);
        a.setLineWrap(true);
        a.setWrapStyleWord(true);
        a.setForeground(Color.BLACK);
        scroll = new JScrollPane(a);
        scroll.setBounds(10,80,250,300);
        c.add(scroll);
        t.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        a.append("Mouse clicked \n");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        a.append("Mouse pressed \n");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        a.append("Mouse released \n");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        a.append("Mouse entered \n");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        a.append("Mouse exited \n");
    }
    public static void main(String[] args) {
        mouseListenerDemo frame = new mouseListenerDemo();
        frame.setVisible(true);
    }

   
   
}
