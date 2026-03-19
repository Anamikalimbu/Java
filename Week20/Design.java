import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;



public class Design {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Signup");
        frame.setSize(1000, 1000);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(300, 250, 420, 340);
        panel.setLayout(null);

        Border border = BorderFactory.createLineBorder(new Color(0, 170, 255), 2);
        panel.setBorder(border);


        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 20, 100, 30);
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(120, 20, 200, 30);
        panel.add(emailField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 70, 100, 30);
        panel.add(genderLabel);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(120, 70, 100, 30);
        panel.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(230, 70, 100, 30);
        panel.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel provinceLabel = new JLabel("Places:");
        provinceLabel.setBounds(20, 120, 100, 30);
        panel.add(provinceLabel);

        String[] places = { "Itahari", "Dharan", "Biratnagar" };
        JComboBox<String> provinceComboBox = new JComboBox<>(places);
        provinceComboBox.setBounds(120, 120, 200, 30);
        panel.add(provinceComboBox);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(120, 170, 200, 80);
        panel.add(addressArea);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 270, 120, 35);
        panel.add(submitButton);

        //Add action listener 
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String email = emailField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String place = (String) provinceComboBox.getSelectedItem();
                String comment = addressArea.getText();

                String details = "Email: " + email + "\nGender: " + gender + "\nPlace: " + place + "\nComment: " + comment;

                //for alert box or popup box
                JOptionPane.showMessageDialog(frame, details, "Submitted Details", JOptionPane.WARNING_MESSAGE);
                    
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
