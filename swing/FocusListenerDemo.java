package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FocusListenerDemo extends JFrame implements FocusListener{
    private Container c;
    private Font f;
    private JButton btn;
    private JTextArea a;
    private Cursor cursor;
    
    FocusListenerDemo()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);
        this.setTitle("Focus listener");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        f = new Font("Arial",Font.BOLD,18);
        btn = new JButton("Click");
        btn.setBounds(30,50,100,50);
        btn.setFont(f);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.CYAN);
        btn.setCursor(cursor);
        c.add(btn);
        
        a = new JTextArea();
        a.setBounds(150,30,300,300);
        a.setFont(f);
        a.setBackground(Color.BLACK);
        a.setForeground(Color.CYAN);
        c.add(a);
        btn.addFocusListener(this);
        
    }
    
    @Override
    public void focusGained(FocusEvent fe) {
        a.setText("Focus Gained");
    }

    @Override
    public void focusLost(FocusEvent fe) {
        a.setText("Focus lost");
    }
    
    public static void main(String[] args) {
        FocusListenerDemo frame = new FocusListenerDemo();
        frame.setVisible(true);
    }
    
}
