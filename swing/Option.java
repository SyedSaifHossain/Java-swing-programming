package swing;

import javax.swing.JOptionPane;

public class Option {
    
    
    
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to quit","Confirm",JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else
        {
           JOptionPane.showMessageDialog(null,"You have pressed no option","Message",JOptionPane.PLAIN_MESSAGE);
        }
        
    }
    
}
