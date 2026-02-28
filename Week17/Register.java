
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Register
{
     public static void main(String [] args){
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(800, 500);
        
        frame.setLayout(null);
        
        JLabel fnameLabel = new JLabel("FirstName:");
        fnameLabel.setBounds(50, 50, 100, 30);
        frame.add(fnameLabel);
        
        JTextField fnameField = new JTextField();
        fnameField.setBounds(150, 50, 200, 30);
        frame.add(fnameField);
        
        JLabel lnameLabel = new JLabel("LastName:");
        lnameLabel.setBounds(400, 50, 100, 30);
        frame.add(lnameLabel);
        
        JTextField lnameField = new JTextField();
        lnameField.setBounds(500, 50, 200, 30);
        frame.add(lnameField);
        
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 30);
        frame.add(emailLabel);
        
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 30);
        frame.add(emailField);
        
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(400, 100, 100, 30);
        frame.add(passLabel);
        
        JTextField passField = new JTextField();
        passField.setBounds(500, 100, 200, 30);
        frame.add(passField);
        
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 150, 100, 30);
        frame.add(addressLabel);
        
        JTextField addressField = new JTextField();
        addressField.setBounds(150, 150, 200, 30);
        frame.add(addressField);
        
        JLabel codeLabel = new JLabel("SecretCode:");
        codeLabel.setBounds(400, 150, 100, 30);
        frame.add(codeLabel);
        
        JTextField codeField = new JTextField();
        codeField.setBounds(500, 150, 200, 30);
        frame.add(codeField);
        
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(200, 200, 100, 30);
        frame.add(genderLabel);
        
        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(250, 200, 100, 30);
        frame.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(350, 200, 100, 30);
        frame.add(femaleButton);
        
        JButton submitButton = new JButton("Register");
        submitButton.setBounds(300,250,100,30);
        frame.add(submitButton);
        
        frame.setVisible(true);
    }
}