
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
public class App
{
    public static void main(String [] args){
        JFrame frame = new JFrame("Singup Form");
        //size of the frame
        frame.setSize(600, 600);
        //layout of the frame
        frame.setLayout(null);
        
        JLabel nameLabel = new JLabel("UserName:");
        nameLabel.setBounds(50, 50, 100, 30);
        frame.add(nameLabel);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        frame.add(nameField);
        
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 30);
        frame.add(emailLabel);
        
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 30);
        frame.add(emailField);
        
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 150, 100, 30);
        frame.add(passLabel);
        
        JTextField passField = new JTextField();
        passField.setBounds(150, 150, 200, 30);
        frame.add(passField);
        
        JButton submitButton = new JButton("Singup");
        submitButton.setBounds(200,200,100,30);
        frame.add(submitButton);
        
        
        
        
        
    
        frame.setVisible(true);
    }
}