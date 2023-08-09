package swing;

import javax.swing.JFrame;

public class FrameDemo {
    
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocation(50,100);
        frame.setTitle("Frame");
    }
}
