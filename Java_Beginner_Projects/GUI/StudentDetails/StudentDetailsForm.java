package GUI.StudentDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class StudentDetailsForm extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField emailField;
    private JButton saveButton;

    public StudentDetailsForm() {
        super("Student Details");
        setLayout(new BorderLayout());

        // Create panel for fields and buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveListener());
        panel.add(new JLabel()); // Empty label for layout
        panel.add(saveButton);

        add(panel, BorderLayout.CENTER);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();

            try (FileWriter writer = new FileWriter("student_details.txt")) {
                writer.write("Name: " + name + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("Email: " + email + "\n");
                JOptionPane.showMessageDialog(null, "Details saved successfully");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error saving details", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

