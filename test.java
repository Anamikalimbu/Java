import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class test {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("Application");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setSize(420, 420);

    frame.setVisible(true);
    ImageIcon image = new ImageIcon("logo.jpg");
    frame.setIconImage(image.getImage());
    frame.getContentPane().setBackground(new Color(0x43A5BE));
    }
    
}
