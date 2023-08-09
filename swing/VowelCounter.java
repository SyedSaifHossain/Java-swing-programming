package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounter extends JFrame implements KeyListener{
    
    private Container c;
    private JLabel TLabel,aLabel,eLabel,iLabel,oLabel,uLabel,totalVowel;
    private JTextArea a;
    private Font f;
    private JScrollPane scroll;
    int aletter = 0;
    int eletter = 0;
    int iletter = 0;
    int oletter = 0;
    int uletter = 0;
    int tletter = 0;

    VowelCounter()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);
        this.setTitle("Vowel counter");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        f = new Font("Arial",Font.BOLD,18);
        
        TLabel = new JLabel("Enter the text : ");
        TLabel.setBounds(10,10,150,50);
        TLabel.setForeground(Color.CYAN);
        TLabel.setFont(f);
        c.add(TLabel);
        a = new JTextArea();
        a.setBackground(Color.CYAN);
        a.setForeground(Color.BLACK);
        a.setFont(f);
        a.setLineWrap(true);
        a.setWrapStyleWord(true);
        scroll = new JScrollPane(a);
        scroll.setBounds(170,10,300,150);
        c.add(scroll);
        
        totalVowel = new JLabel("Total number of vowel : ");
        totalVowel.setBounds(10,170,290,50);
        totalVowel.setFont(f);
        totalVowel.setForeground(Color.CYAN);
        c.add(totalVowel);
       
        aLabel = new JLabel("Total number of a : ");
        aLabel.setBounds(10,200,190,50);
        aLabel.setFont(f);
        aLabel.setForeground(Color.CYAN);
        c.add(aLabel);
        
        eLabel = new JLabel("Total number of e : ");
        eLabel.setBounds(10,230,190,50);
        eLabel.setFont(f);
        eLabel.setForeground(Color.CYAN);
        c.add(eLabel);
        
        iLabel = new JLabel("Total number of i : ");
        iLabel.setBounds(10,260,190,50);
        iLabel.setFont(f);
        iLabel.setForeground(Color.CYAN);
        c.add(iLabel);
        
        oLabel = new JLabel("Total number of o : ");
        oLabel.setBounds(10,295,190,50);
        oLabel.setFont(f);
        oLabel.setForeground(Color.CYAN);
        c.add(oLabel);
        
        uLabel = new JLabel("Total number of u : ");
        uLabel.setBounds(10,325,190,50);
        uLabel.setFont(f);
        uLabel.setForeground(Color.CYAN);
        c.add(uLabel);
        
        a.addKeyListener(this);  
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getSource() == a)
        {
            if(ke.VK_A == ke.getKeyCode())
            {
                aletter++;
                tletter++;
            }
            if(ke.VK_E == ke.getKeyCode())
            {
                eletter++;
                tletter++;
            }
            if(ke.VK_I == ke.getKeyCode())
            {
                iletter++;
                tletter++;
            }
            if(ke.VK_O == ke.getKeyCode())
            {
                oletter++;
                tletter++;
            }
            if(ke.VK_U == ke.getKeyCode())
            {
                uletter++;
                tletter++;
            }
            
            totalVowel.setText("Total number of vowel : "+tletter);
            aLabel.setText("Total number of a : "+aletter);
            eLabel.setText("Total number of e : "+eletter);
            iLabel.setText("Total number of i : "+iletter);
            oLabel.setText("Total number of o : "+oletter);
            uLabel.setText("Total number of u : "+uletter);
                
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
    
    public static void main(String[] args) {
        VowelCounter frame = new VowelCounter();
        frame.setVisible(true);
    }

}
