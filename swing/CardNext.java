package swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardNext extends JFrame implements ActionListener{
    private Container c;
    private CardLayout card;
    private JButton btn1,btn2,btn3;
    
    CardNext()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,300,300);
        this.setTitle("Card layout next");
        c = this.getContentPane();
        card = new CardLayout();
        c.setLayout(card);
        
        btn1 = new JButton("1");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.CYAN);
        c.add(btn1,"First");
        btn2 = new JButton("2");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.CYAN);
        c.add(btn2,"Second");
        btn3 = new JButton("3");
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.CYAN);
        c.add(btn3,"Third");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        card.next(c);
    }
    
    public static void main(String[] args) {
        CardNext frame = new CardNext();
        frame.setVisible(true);
    }

    
}
