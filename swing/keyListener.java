package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class keyListener extends JFrame implements KeyListener{
    
    private Container c;
    private Font f;
    private JTextField t;
    private JTextArea a;
    private JScrollPane scroll;
    keyListener()
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
        t.addKeyListener(this);
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        a.append("Key typed : "+ke.getKeyChar()+"\n");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        a.append("Key pressed : "+ke.getKeyChar()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        a.append("Key released : "+ke.getKeyChar()+"\n");
    }
    public static void main(String[] args) {
        keyListener frame = new keyListener();
        frame.setVisible(true);
    }  
}


