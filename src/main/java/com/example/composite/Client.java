package com.example.composite;

import javax.swing.*;
import java.awt.*;

public class Client {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JPanel component = new JPanel();
            component.add(new Button("Some button"));
            component.add(new Button("Button 2"));
            component.setBackground(Color.BLACK);

            JPanel panel = new JPanel();
            panel.add(new JLabel("Some text"));
            panel.add(component);

            JFrame frame = new JFrame("Composite pattern");
            frame.getContentPane().add(panel);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 300);
            frame.setVisible(true);
        });
    }
}
