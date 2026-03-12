import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Design
{
    public static void main(String [] args){
        JFrame frame = new JFrame ("Signup");
        frame.setSize(800, 800);
        frame.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(40, 80, 420, 320);
        frame.add(panel);
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
        panel.setBorder(border);
        
        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(20, 20, 100, 30);
        panel.add(emailLabel);
        
        JTextField emailField = new JTextField();
        emailField.setBounds(100, 20, 200, 30);
        panel.add(emailField);
        
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 60, 100, 30);
        panel.add(genderLabel);
        
        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(100, 60, 100, 30);
        panel.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(200, 60, 100, 30);
        panel.add(femaleButton);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        
        JLabel placeLabel = new JLabel("Place:");
        placeLabel.setBounds(20, 120, 100, 30);
        panel.add(placeLabel);
        
        String [] places = {"Dharan", "Itahari", "Birtnagar", "Kathmandu", "Damak"};
        JComboBox <String> placeComboBox = new JComboBox<>(places);
        placeComboBox.setBounds(100, 120, 200, 30);
        panel.add(placeComboBox); 
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(100, 160, 200, 100);
        panel.add(textArea);
        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150,270,100,30);
        panel.add(submitButton);
        
        
        
        frame.setVisible(true);
    }
}
