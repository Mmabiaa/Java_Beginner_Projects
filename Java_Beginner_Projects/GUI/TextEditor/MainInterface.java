package GUI.TextEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem closeItem;
    private JMenu helpMenu;
    private JMenuItem aboutItem;
    private JButton textEditorButton;

    public MainInterface() {
        super("Main Interface");
        setLayout(new BorderLayout());

        // Create menu bar
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        closeItem = new JMenuItem("Close");
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close main interface
                new LoginScreen();
            }
        });
        fileMenu.add(closeItem);
        menuBar.add(fileMenu);

        helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Developed by [Your Name]");
            }
        });
        helpMenu.add(aboutItem);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        // Create panel for buttons
        JPanel panel = new JPanel();
        textEditorButton = new JButton("Text Editor");
        textEditorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TextEditor();
            }
        });
        panel.add(textEditorButton);

        add(panel, BorderLayout.CENTER);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

