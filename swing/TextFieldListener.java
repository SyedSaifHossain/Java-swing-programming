package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextFieldListener extends JFrame implements ActionListener{
    private Container c;
    private JTextField text;
    private Font f;
    
    TextFieldListener()
    {
        initial();
    }
    public void initial()
    {
        this.setTitle("Text Field");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        text = new JTextField();
        text.setBounds(100,10,300,50);
        text.setOpaque(true);
        text.setBackground(Color.BLACK);
        text.setForeground(Color.CYAN);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setToolTipText("Enter your name");
        text.setFont(f);
        c.add(text);
        
        text.addActionListener(this);
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
        String s = text.getText();
        if(s.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"You did not enter anything");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Your name is : "+s);
        }
    }
    
    public static void main(String[] args) {
        TextFieldListener frame = new TextFieldListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,500,500);
    }

    
}
