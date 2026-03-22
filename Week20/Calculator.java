import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setLayout(null);

        // TextField
        JTextField tf = new JTextField();
        tf.setBounds(20, 20, 240, 40);
        frame.add(tf);

        // Variables
        final double[] num1 = new double[1];
        final char[] op = new char[1];

        // Buttons
        JButton b1 = new JButton("1");
        b1.setBounds(20, 80, 50, 40);
        JButton b2 = new JButton("2");
        b2.setBounds(80, 80, 50, 40);
        JButton b3 = new JButton("3");
        b3.setBounds(140, 80, 50, 40);
        JButton add = new JButton("+");
        add.setBounds(200, 80, 50, 40);

        JButton b4 = new JButton("4");
        b4.setBounds(20, 130, 50, 40);
        JButton b5 = new JButton("5");
        b5.setBounds(80, 130, 50, 40);
        JButton b6 = new JButton("6");
        b6.setBounds(140, 130, 50, 40);
        JButton sub = new JButton("-");
        sub.setBounds(200, 130, 50, 40);

        JButton b7 = new JButton("7");
        b7.setBounds(20, 180, 50, 40);
        JButton b8 = new JButton("8");
        b8.setBounds(80, 180, 50, 40);
        JButton b9 = new JButton("9");
        b9.setBounds(140, 180, 50, 40);
        JButton mul = new JButton("*");
        mul.setBounds(200, 180, 50, 40);

        JButton b0 = new JButton("0");
        b0.setBounds(20, 230, 50, 40);
        JButton eq = new JButton("=");
        eq.setBounds(80, 230, 50, 40);
        JButton clr = new JButton("C");
        clr.setBounds(140, 230, 50, 40);
        JButton div = new JButton("/");
        div.setBounds(200, 230, 50, 40);

        // Add buttons
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(add);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(sub);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(mul);
        frame.add(b0);
        frame.add(eq);
        frame.add(clr);
        frame.add(div);

        // Action Listeners for number buttons
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "1");
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "2");
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "3");

            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "4");
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "5");
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "6");
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "7");
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "8");
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "9");
            }
        });
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText() + "0");
            }
        });

        // Operator buttons
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1[0] = Double.parseDouble(tf.getText());
                op[0] = '+';
                tf.setText("");
            }
        });

        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1[0] = Double.parseDouble(tf.getText());
                op[0] = '-';
                tf.setText("");
            }
        });

        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1[0] = Double.parseDouble(tf.getText());
                op[0] = '*';
                tf.setText("");
            }
        });

        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1[0] = Double.parseDouble(tf.getText());
                op[0] = '/';
                tf.setText("");
            }
        });

        // Equals button
        eq.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num2 = Double.parseDouble(tf.getText());
                double result = 0;
                if(op[0] == '+') {
                    result = num1[0] + num2;
                } else if(op[0] == '-') {
                    result = num1[0] - num2;
                } else if(op[0] == '*') {
                    result = num1[0] * num2;
                } else if(op[0] == '/') {
                    result = num1[0] / num2;
                }
                tf.setText("" + result);
            }
        });

        // Clear button
        clr.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
            }
        });

        frame.setVisible(true);
    }
}
