package swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameImage extends JFrame{
   
    private ImageIcon img;
    
    FrameImage()
    {
        initial();
    }
    public void initial()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,100,500,300);
        this.setTitle("Set image in the frame");
        img = new ImageIcon(getClass().getResource("Intermediate.png"));
        this.setIconImage(img.getImage());
    }
    
    
    public static void main(String[] args) {
        FrameImage  frame = new FrameImage();
        frame.setVisible(true);
    }
}
