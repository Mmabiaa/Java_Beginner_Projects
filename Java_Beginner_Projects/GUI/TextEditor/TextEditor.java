package GUI.TextEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor extends JFrame {
    private JTextArea textArea;
    private JButton openButton;
    private JButton saveButton;
    private JMenuBar menuBar;
    private JMenu fontSizeMenu;
    private JMenu fontTypeMenu;

    public TextEditor() {
        super("Text Editor");
        setLayout(new BorderLayout());

        // Create text area
        textArea = new JTextArea(20, 40);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create panel for buttons
        JPanel panel = new JPanel();
        openButton = new JButton("Open Text File");
        openButton.addActionListener(new OpenListener());
        panel.add(openButton);

        saveButton = new JButton("Save To Text File");
        saveButton.addActionListener(new SaveListener());
        panel.add(saveButton);

        add(panel, BorderLayout.SOUTH);

        // Create menu bar
        menuBar = new JMenuBar();
        fontSizeMenu = new JMenu("Font Size");
        JMenuItem fontSize12Item = new JMenuItem("12");
        fontSize12Item.addActionListener(new FontSizeListener(12));
        fontSizeMenu.add(fontSize12Item);
        JMenuItem fontSize14Item = new JMenuItem("14");
        fontSize14Item.addActionListener(new FontSizeListener(14));
        fontSizeMenu.add(fontSize14Item);
        menuBar.add(fontSizeMenu);

        fontTypeMenu = new JMenu("Font Type");
        JMenuItem arialItem = new JMenuItem("Arial");
        arialItem.addActionListener(new FontTypeListener("Arial"));
        fontTypeMenu.add(arialItem);
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        timesNewRomanItem.addActionListener(new FontTypeListener("Times New Roman"));
        fontTypeMenu.add(timesNewRomanItem);
        menuBar.add(fontTypeMenu);

        setJMenuBar(menuBar);

        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class OpenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (Scanner scanner = new Scanner(file)) {
                    StringBuilder content = new StringBuilder();
                    while (scanner.hasNextLine()) {
                        content.append(scanner.nextLine()).append("\n");
                    }
                    textArea.setText(content.toString());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error opening file", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(textArea.getText());
                    JOptionPane.showMessageDialog(null, "File saved successfully");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class FontSizeListener implements ActionListener {
        private int fontSize;

        public FontSizeListener(int fontSize) {
            this.fontSize = fontSize;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(textArea.getFont().getName(), Font.PLAIN, fontSize));
        }
    }

    private class FontTypeListener implements ActionListener {
        private String fontType;

        public FontTypeListener(String fontType) {
            this.fontType = fontType;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(fontType, Font.PLAIN, textArea.getFont().getSize()));
        }
    }
}

