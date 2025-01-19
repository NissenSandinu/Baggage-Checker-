package Baggage;

/*
 * Author: Nissen Sandinu Wettasinghe
 * Modified Date: January 18, 2024
 * Description:
 * This class provides a graphical user interface (GUI) for handling baggage information. 
 * Users can input baggage dimensions and weight, and the application displays details about the baggage, 
 * including eligibility for carry-on and overweight status.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaggageGUI {
    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Baggage Handler Software");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 00);

        // Create components
        JLabel lengthLabel = new JLabel("Length (cm):");
        JTextField lengthField = new JTextField(10);

        JLabel widthLabel = new JLabel("Width (cm):");
        JTextField widthField = new JTextField(10);

        JLabel heightLabel = new JLabel("Height (cm):");
        JTextField heightField = new JTextField(10);

        JLabel weightLabel = new JLabel("Weight (kg):");
        JTextField weightField = new JTextField(10);

        JButton submitButton = new JButton("Submit");
        submitButton.setForeground(Color.BLUE);

        JButton quitButton = new JButton("Quit");
        quitButton.setForeground(Color.RED);

        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(lengthLabel);
        panel.add(lengthField);
        panel.add(widthLabel);
        panel.add(widthField);
        panel.add(heightLabel);
        panel.add(heightField);
        panel.add(weightLabel);
        panel.add(weightField);
        panel.add(submitButton);
        panel.add(quitButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Action Listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int length = Integer.parseInt(lengthField.getText());
                    int width = Integer.parseInt(widthField.getText());
                    int height = Integer.parseInt(heightField.getText());
                    double weight = Double.parseDouble(weightField.getText());

                    Baggage bag = new Baggage(length, width, height, weight);
                    String result = bag.toString();
                    outputArea.append(result + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        quitButton.addActionListener(e -> System.exit(0));

        // Display the frame
        frame.setVisible(true);
    }
}
