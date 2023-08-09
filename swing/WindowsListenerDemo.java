package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowsListenerDemo extends JFrame{
    
    private Container c;
    WindowsListenerDemo()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Windows listener");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent we) {
                System.out.println("Window opened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent we) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent we) {
                System.out.println("window iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                System.out.println("Window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                System.out.println("Window deactivated");
            }
        
        });
        
    }
    public static void main(String[] args) {
        WindowsListenerDemo frame = new WindowsListenerDemo();
        frame.setVisible(true);
    }
}
