import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class Student {
    protected int id;
    protected String name;
    protected String section;

    public Student(int id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void getAddress() {
        System.out.println("Address: Kathmandu, Nepal");
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }
}

class BBA extends Student {

    public BBA(int id, String name, String section) {
        super(id, name, section);
    }
}

class BIT extends Student {

    public BIT(int id, String name, String section) {
        super(id, name, section);
    }
}

public class ExceptionandFileHandling {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        JFrame frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(50, 50, 100, 30);
        frame.add(idLabel);
        JTextField idField = new JTextField();
        idField.setBounds(150, 50, 100, 30);
        frame.add(idField);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 100, 100, 30);
        frame.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 100, 100, 30);
        frame.add(nameField);

        // radio buttons for BBA and BIT
        JRadioButton bbaButton = new JRadioButton("BBA");
        bbaButton.setBounds(50, 150, 100, 30);
        frame.add(bbaButton);
        JRadioButton bitButton = new JRadioButton("BIT");
        bitButton.setBounds(150, 150, 100, 30);
        frame.add(bitButton);

        // displaying panel or textfield
        JTextArea displayArea = new JTextArea();
        displayArea.setBounds(400, 200, 200, 100);
        frame.add(displayArea);

        ButtonGroup group = new ButtonGroup();
        group.add(bbaButton);
        group.add(bitButton);

        JButton addButton = new JButton("Add Student");
        addButton.setBounds(50, 200, 150, 30);
        frame.add(addButton);
        // to add student to the array list
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String section = "";
                if (bbaButton.isSelected()) {
                    section = "BBA";
                } else if (bitButton.isSelected()) {
                    section = "BIT";
                }
                Student student;
                if (section.equals("BBA")) {
                    student = new BBA(id, name, section);
                } else {
                    student = new BIT(id, name, section);
                }
                students.add(student);
            }
        });

        // add button display
        JButton displayButton = new JButton("Display Students");
        displayButton.setBounds(50, 250, 150, 30);
        frame.add(displayButton);

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // load from file button
        JButton loadButton = new JButton("Load from File");
        loadButton.setBounds(50, 300, 150, 30);
        frame.add(loadButton);

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        // save to file button
        JButton saveButton = new JButton("Save to File");
        saveButton.setBounds(50, 350, 150, 30);
        frame.add(saveButton);

        // save to file action (method)
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        frame.setVisible(true);

    }
}
