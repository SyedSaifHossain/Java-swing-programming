package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTabel extends JFrame{
    
    private Container c;
    private JLabel textLabel;
    private JTextField t;
    private JTextArea a;
    private Font f;
    private JButton button;
    MultiplicationTabel()
    {
        initial();
    }
    
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,370,500);
        this.setTitle("Multiplication Tabel");
        
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial",Font.BOLD,18);
        textLabel = new JLabel("Enter any number : ");
        textLabel.setBounds(10,10,190,50);
        textLabel.setForeground(Color.BLUE);
        textLabel.setFont(f);
        c.add(textLabel);
        
        t = new JTextField();
        t.setBounds(200,10,100,50);
        t.setBackground(Color.BLACK);
        t.setForeground(Color.CYAN);
        t.setFont(f);
        t.setHorizontalAlignment(JTextField.CENTER);
        c.add(t);
        a = new JTextArea();
        a.setBounds(10,70,330,300);
        a.setBackground(Color.BLACK);
        a.setForeground(Color.CYAN);
        a.setFont(f);
        c.add(a);
        
        button = new JButton("Clear");
        button.setBounds(200,390,100,50);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.CYAN);
        button.setFont(f);
        c.add(button);
        t.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = t.getText();
                if(value.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"You did not put anything","Message",JOptionPane.PLAIN_MESSAGE);
                }
                
                else
                {
                    a.setText("");
                    int number,result,i;
                    number = Integer.parseInt(t.getText());
                    for(i=1; i<=10; i++)
                    {
                        result = number * i;
                        String n = String.valueOf(number);
                        String increment = String.valueOf(i);
                        String r = String.valueOf(result);
                        a.append(n+ " X " +increment +" = " +r +"\n");
                    } 
                }
            }
         });
        
        button.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText("");
            }
         });
                
        
    }
    
    public static void main(String[] args) {
        MultiplicationTabel frame = new MultiplicationTabel();
        frame.setVisible(true);
    }
}
